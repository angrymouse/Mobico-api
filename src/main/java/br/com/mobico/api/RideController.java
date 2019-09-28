package br.com.mobico.api;

import br.com.mobico.domain.Ride;
import br.com.mobico.dto.CreateRideRequest;
import br.com.mobico.dto.RideResponse;
import br.com.mobico.mappers.RideServiceMapper;
import br.com.mobico.repository.RideRepository;
import br.com.mobico.service.exceptions.NotFoundException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
public class RideController {

    @Autowired
    RideServiceMapper rideServiceMapper;

    @Autowired
    RideRepository rideRepository;

    @Autowired
    ObjectMapper objectMapper;

    @PostMapping(value = "rides", consumes = "application/json")
    public ResponseEntity saveRide(@Valid CreateRideRequest body) {
        Ride ride = null;
        try {
            ride = rideServiceMapper.mapToRide(body);
            rideRepository.save(ride);
            return new ResponseEntity(HttpStatus.OK);
        } catch (NotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value = "rides", produces = "application/json")
    public ResponseEntity<List<RideResponse>> getRides() {
        return objectMapper.convertValue(rideRepository.findAll(), new TypeReference<List<RideResponse>>(){});
    }
}
