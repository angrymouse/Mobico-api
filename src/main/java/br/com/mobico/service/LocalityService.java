package br.com.mobico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.mobico.repository.LocalityRepository;

@Service
public class LocalityService {
	@Autowired private ObjectMapper objectMapper;
	@Autowired private LocalityRepository repository;
	
	public List<br.com.mobico.dto.Locality> find() {
		var localities = repository.findActiveLocalities();
		return objectMapper.convertValue(localities, new TypeReference<List<br.com.mobico.dto.Locality>>(){});
	}
}
