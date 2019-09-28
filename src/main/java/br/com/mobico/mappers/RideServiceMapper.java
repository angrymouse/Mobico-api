package br.com.mobico.mappers;

import br.com.mobico.domain.Ride;
import br.com.mobico.dto.CreateRideRequest;
import br.com.mobico.repository.LocalityRepository;
import br.com.mobico.repository.VanRepository;
import br.com.mobico.service.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RideServiceMapper {
	
	@Autowired private VanRepository vanRepository;
	@Autowired private LocalityRepository localityRepository;
	
	public Ride mapToRide (CreateRideRequest rideRequest) throws NotFoundException {

		var ride = new Ride();

		ride.setOrigin(localityRepository.findById(rideRequest.getOrigin()).get());
		ride.setDestination(localityRepository.findById(rideRequest.getDestination()).get());
		var optVan = vanRepository.findById(rideRequest.getVanId());

		if(optVan.isEmpty()) {
			throw new NotFoundException();
		}
		var car = optVan.get();
		ride.setVan(car);
		ride.setOriginDescription(rideRequest.getOriginDescription());
		return ride;
	}

}
