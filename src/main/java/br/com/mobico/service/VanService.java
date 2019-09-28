package br.com.mobico.service;

import br.com.mobico.domain.Van;
import br.com.mobico.dto.VanRequest;
import br.com.mobico.dto.VanResponse;
import br.com.mobico.repository.AccountRepository;
import br.com.mobico.repository.VanRepository;
import br.com.mobico.repository.DriverProfileRepository;
import br.com.mobico.service.exceptions.ForbiddenAccess;
import br.com.mobico.service.exceptions.NotFoundException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;

@Service
public class VanService {
	
	@Autowired private ObjectMapper objectMapper;
	@Autowired private AccountRepository accountRepository;
	@Autowired private DriverProfileRepository driverProfileRepository;
	@Autowired private VanRepository vanRepository;
	
	public VanResponse save(VanRequest vanRequest, Principal principal) {
		var van = objectMapper.convertValue(vanRequest, Van.class);
		van.setActive(true);
		var profile = driverProfileRepository.findByAccountEmail(principal.getName());
		van.setDriverProfile(profile);
		van.setActive(true);
		vanRepository.save(van);
		return objectMapper.convertValue(van, VanResponse.class);
	}
	
	public VanResponse find(int id) throws NotFoundException {
		var optVan = vanRepository.findById(id);
		if (optVan.isEmpty()) {
			throw new NotFoundException();
		} else {
			var van = optVan.get();
			return objectMapper.convertValue(van, VanResponse.class);
		}
		
	}
	
	public void delete(int id, Principal user) throws NotFoundException, ForbiddenAccess {
		var account = accountRepository.findByEmail(user.getName());
		var optVan = vanRepository.findById(id);
		if (optVan.isEmpty()) {
			throw new NotFoundException();
		} else {
			var van = optVan.get();
			if(van.getDriverProfile().getId().intValue() != account.getId().intValue()) {
				throw new ForbiddenAccess();
			}
			van.setActive(Boolean.FALSE);
			vanRepository.save(van);
		}
	}
	
	public List<VanResponse> getVansFromUser(Principal user) {
		var account = accountRepository.findByEmail(user.getName());
		var vans = vanRepository.findByActiveTrueAndDriverProfileId(account.getId());
		return objectMapper.convertValue(vans, new TypeReference<List<VanResponse>>(){});
	}
	
}
