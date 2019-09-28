package br.com.mobico.repository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.mobico.domain.Profile;
import br.com.mobico.domain.Ride;

public interface RideRepository extends JpaRepository<Ride, Integer>, RideRepositoryCustom {

	public List<Ride> findByActiveTrue();
	
	public List<Ride> findByActiveTrueAndDepartureTimeAfter(Timestamp departureTime);
	
	public List<Ride> findByActiveTrueAndDepartureTimeAfterAndVanProfile(Timestamp departureTime, Profile profile);
	
	@Query("SELECT r from Ride r LEFT JOIN r.passengers p WHERE r.departureTime > :departureTime and (r.van.profile = :profile or p.profile = :profile)")
	public List<Ride> findByActiveTrueAndDepartureTimeAfterAndVanProfileOrPassengersProfile(Timestamp departureTime, Profile profile);
	
	public List<Ride> findByActiveTrueAndDepartureTimeAfterAndPassengersProfile(Timestamp departureTime, Profile driverProfile);

	public List<Ride> findByVanProfile(Profile profile);

	public Optional<Ride> findByIdAndActiveTrue(Integer id);

}
