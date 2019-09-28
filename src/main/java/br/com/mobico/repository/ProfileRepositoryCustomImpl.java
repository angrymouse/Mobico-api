package br.com.mobico.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class ProfileRepositoryCustomImpl implements ProfileRepositoryCustom {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Integer> findDistinctUserIdByPassengerOriginOrDestiny(Integer originId, Integer destinationId) {
        StringBuilder sb = new StringBuilder();
        sb
                .append(" select distinct(passenger.profile.id) from Passenger passenger ")
                .append(" join passenger.ride r ")
                .append(" join r.origin origin ")
                .append(" join r.destination destination ")
                .append(" where origin.id = :originId ")
                .append(" or destination.id = :originId ")
                .append(" or origin.id = :destinationId ")
                .append(" or destination.id = :destinationId ");
        var query = entityManager.createQuery(sb.toString(), Integer.class);
        query.setParameter("originId", originId);
        query.setParameter("destinationId", destinationId);
        return query.getResultList();
    }

    @Override
    public List<Integer> findIdByPassengersNull() {
        return entityManager.createQuery("Select p.id from Profile p where p not in (select pass.profile from Passenger pass)").getResultList();
    }

}
