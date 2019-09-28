package br.com.mobico.repository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.com.mobico.domain.Profile;
import br.com.mobico.domain.Ride;

public class RideRepositoryImpl implements RideRepositoryCustom {
	
	@PersistenceContext
    EntityManager entityManager;
	
	@Override
	public List<Ride> find(Timestamp minimumDepartureTime, Optional<Profile> driver, Optional<Profile> passenger,
			Optional<Integer> originId, Optional<Integer> destinationId) {
		var builder = new StringBuilder();
		builder.append("SELECT r FROM Ride as r ");
		builder.append(" WHERE r.active = true");
		builder.append(" AND r.departureTime > :departureTime ");
		if(driver.isPresent()) builder.append(" AND ( r.van.profile = :driver ");
		if(passenger.isPresent()) {
			if(driver.isPresent()) builder.append("OR"); 
			else builder.append("AND");
			
			builder.append(" :passenger in (select p.profile from Passenger as p where p.ride = r) "); 
		}
		if(driver.isPresent()) builder.append(" ) ");
		
		if(originId.isPresent()) builder.append(" AND r.origin.id = :originId ");
		if(destinationId.isPresent()) builder.append(" AND r.destination.id = :destinationId ");

		builder.append(" order by r.departureTime asc ");
		
		TypedQuery<Ride> query = entityManager.createQuery(builder.toString(), Ride.class);
		query.setParameter("departureTime", minimumDepartureTime);
		if(driver.isPresent()) query.setParameter("driver", driver.get());
		if(passenger.isPresent()) query.setParameter("passenger", passenger.get());
		if(originId.isPresent()) query.setParameter("originId", originId.get());
		if(destinationId.isPresent()) query.setParameter("destinationId", destinationId.get());
        
        return query.getResultList();
	}

}
