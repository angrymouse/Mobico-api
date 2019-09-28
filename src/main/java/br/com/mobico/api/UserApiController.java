package br.com.mobico.api;

import br.com.mobico.dto.AccountRequest;
import br.com.mobico.service.UserService;
import br.com.mobico.service.exceptions.EmailAlreadyUsedException;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
public class UserApiController {

    @Autowired
    UserService userService;

    @PostMapping(value="user/account", consumes = { "application/json" })
    public ResponseEntity<Void> userAccountPost(
            @ApiParam(value = "Callback payload") @Valid @RequestBody AccountRequest body) {
        try {
            userService.createAccount(body);
        } catch (EmailAlreadyUsedException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "E-mail já em uso", e);
        }
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


}
