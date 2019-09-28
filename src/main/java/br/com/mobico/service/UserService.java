package br.com.mobico.service;

import br.com.mobico.domain.Account;
import br.com.mobico.domain.DriverProfile;
import br.com.mobico.dto.*;
import br.com.mobico.repository.AccountRepository;
import br.com.mobico.repository.DriverProfileRepository;
import br.com.mobico.security.PasswordEncoder;
import br.com.mobico.service.exceptions.EmailAlreadyUsedException;
import br.com.mobico.service.exceptions.ForbiddenAccess;
import br.com.mobico.service.exceptions.NotFoundException;
import br.com.mobico.service.exceptions.UnsecurePasswordException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import java.security.Principal;
import java.util.Date;

@Service
public class UserService {

	private final ObjectMapper objectMapper;
	private final AccountRepository accountRepository;
	private final DriverProfileRepository driverProfileRepository;
	private final PasswordEncoder passwordEncoder;

	public UserService(ObjectMapper objectMapper, AccountRepository accountRepository, DriverProfileRepository driverProfileRepository, PasswordEncoder passwordEncoder) {
		this.objectMapper = objectMapper;
		this.accountRepository = accountRepository;
		this.driverProfileRepository = driverProfileRepository;
		this.passwordEncoder = passwordEncoder;
	}

	public void createAccount(@Valid AccountRequest accountRequest) {
		var account = objectMapper.convertValue(accountRequest, Account.class);
		account.setPassword(passwordEncoder.encode(account.getPassword()));
		if (accountRepository.findByEmail(account.getEmail()) != null) {
			throw new EmailAlreadyUsedException();
		}
		account.setCreatedAt(new Date());
		accountRepository.save(account);
	}
	
	public void updateProfile(@Valid DriverProfileRequest request, Principal principal) {
		var account = accountRepository.findByEmail(principal.getName());
		var profile = objectMapper.convertValue(request, DriverProfile.class);
		profile.setId(account.getId());
		driverProfileRepository.save(profile);
	}
	
	public DriverProfileResponse getProfile(Principal principal) {
		var account = accountRepository.findByEmail(principal.getName()); 
		return objectMapper.convertValue(driverProfileRepository.findById(account.getId()), DriverProfileResponse.class);
	} 
	
	public MinimumProfileResponse getProfile(Integer id) throws NotFoundException {
		var optProfile = driverProfileRepository.findById(id);
		if(optProfile.isEmpty()) {
			throw new NotFoundException();
		} else {
			return objectMapper.convertValue(optProfile.get(), MinimumProfileResponse.class);
		}
	}

	@Transactional
	public void updatePassword(@Valid UpdatePasswordRequest passwordRequest, Principal principal) throws ForbiddenAccess, UnsecurePasswordException {
		var account = accountRepository.findByEmail(principal.getName());
		if(!passwordEncoder.matchPassword(passwordRequest.getOldPassword(), account.getPassword())) throw new ForbiddenAccess();
		if(account.getPassword().length() < 8) throw new UnsecurePasswordException();

		account.setPassword(passwordEncoder.encode(passwordRequest.getNewPassword()));
		accountRepository.save(account);
	}
}
