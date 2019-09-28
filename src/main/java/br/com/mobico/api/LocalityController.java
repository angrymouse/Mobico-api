package br.com.mobico.api;

import br.com.mobico.domain.Locality;
import br.com.mobico.repository.LocalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocalityController {

    @Autowired
    private LocalityRepository localityRepository;

    @GetMapping("localities")
    public ResponseEntity<List<Locality>> localityGet() {
        return new ResponseEntity(localityRepository.findAll(), HttpStatus.OK);
    }
}
