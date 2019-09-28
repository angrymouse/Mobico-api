package br.com.mobico.api;

import br.com.mobico.dto.DriverProfileRequest;
import br.com.mobico.dto.DriverProfileResponse;
import br.com.mobico.service.UserService;
import br.com.mobico.service.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.security.Principal;

@RestController
public class DriverApiController {

    @Autowired
    UserService userService;

    @PutMapping(value="driver", consumes = { "application/json" })
    public ResponseEntity<Void> driverPost(@Valid @RequestBody DriverProfileRequest body, Principal principal) {
        userService.updateProfile(body, principal);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value="driver", produces = { "application/json" })
    public ResponseEntity<DriverProfileResponse> driverPost(Principal principal) {
        DriverProfileResponse profile = null;
        try {
            profile = userService.getProfile(principal);
            return new ResponseEntity<DriverProfileResponse>(profile, HttpStatus.OK);
        } catch (NotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }
}
