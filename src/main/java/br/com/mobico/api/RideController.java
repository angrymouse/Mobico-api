package br.com.mobico.api;

import br.com.mobico.domain.Ride;
import br.com.mobico.dto.CreateRideRequest;
import br.com.mobico.dto.RideResponse;
import br.com.mobico.mappers.RideServiceMapper;
import br.com.mobico.repository.AccountRepository;
import br.com.mobico.repository.RideRepository;
import br.com.mobico.repository.VanRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

@RestController
public class RideController {

    @Autowired
    RideServiceMapper rideServiceMapper;

    @Autowired
    RideRepository rideRepository;

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    VanRepository vanRepository;

    @Autowired
    ObjectMapper objectMapper;

    @PostMapping(value = "ride", consumes = "application/json")
    public ResponseEntity saveRide(@RequestBody @Valid CreateRideRequest body) {
        Ride ride = null;
        ride = rideServiceMapper.mapToRide(body);
        rideRepository.save(ride);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping(value = "ride", produces = "application/json")
    public ResponseEntity<List<RideResponse>> getRides() {
        var rides = objectMapper.convertValue(rideRepository.findAll(), new TypeReference<List<RideResponse>>(){});
        return new ResponseEntity(rides, HttpStatus.OK);
    }


    @PostMapping(value = "ride{id}/take")
    public ResponseEntity ridesTake(Integer id, Principal principal) {
        var account = accountRepository.findByEmail(principal.getName());
        var van = vanRepository.findByActiveTrueAndDriverProfileId(account.getId());
        if(van.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.FORBIDDEN);
        }
        var ride = rideRepository.findById(id).get();
        ride.setVan(van.get(0));
        rideRepository.save(ride);
        return new ResponseEntity(HttpStatus.OK);
    }
}
