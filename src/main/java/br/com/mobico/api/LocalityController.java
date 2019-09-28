package br.com.mobico.api;

import br.com.mobico.dto.Locality;
import br.com.mobico.service.LocalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocalityController {

    @Autowired
    private LocalityService localityService;

    @GetMapping("localities")
    public ResponseEntity<List<Locality>> localityGet() {
        return new ResponseEntity(localityService.find(), HttpStatus.OK);
    }
}
