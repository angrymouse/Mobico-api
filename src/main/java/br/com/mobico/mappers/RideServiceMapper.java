package br.com.mobico.mappers;

import br.com.mobico.domain.Ride;
import br.com.mobico.dto.CreateRideRequest;
import br.com.mobico.repository.LocalityRepository;
import br.com.mobico.repository.VanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RideServiceMapper {
	
	@Autowired private VanRepository vanRepository;
	@Autowired private LocalityRepository localityRepository;
	
	public Ride mapToRide (CreateRideRequest rideRequest) {

		var ride = new Ride();
		ride.setOrigin(localityRepository.findById(rideRequest.getOrigin()).get());
		ride.setDestination(localityRepository.findById(rideRequest.getDestination()).get());
		ride.setOriginDescription(rideRequest.getOriginDescription());
		return ride;
	}

}
