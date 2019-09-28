package br.com.mobico.service;

import java.io.IOException;
import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.mobico.domain.ProfilePicture;
import br.com.mobico.repository.AccountRepository;
import br.com.mobico.repository.ProfilePictureRepository;
import br.com.mobico.service.exceptions.NotFoundException;

@Service
public class ProfilePictureService {
	
	@Autowired private ProfilePictureRepository pictureRepository;
	
	@Autowired private AccountRepository accountRepository;
	
	public void saveImage(MultipartFile file, Principal principal) throws IOException {
		var oldProfilePicture = pictureRepository.findByAccountEmail(principal.getName());
		ProfilePicture profilePicture;
		if (oldProfilePicture.isPresent()) {
			profilePicture = oldProfilePicture.get();
		} else {
			profilePicture = new ProfilePicture();
			profilePicture.setAccount(accountRepository.findByEmail(principal.getName()));
		}
		profilePicture.setFileType(file.getContentType());
		profilePicture.setPicture(file.getBytes());
		pictureRepository.save(profilePicture);
	}
	
	public ProfilePicture getPicture(Principal principal) throws NotFoundException {
		var profilePicture = pictureRepository.findByAccountEmail(principal.getName());
		if(profilePicture.isPresent()) {
			return profilePicture.get();
		} else {
			throw new NotFoundException();
		}
	}
	
	public ProfilePicture getPicture(Integer accountId) throws NotFoundException {
		var profilePicture = pictureRepository.findByAccountId(accountId);
		if(profilePicture.isPresent()) {
			return profilePicture.get();
		} else {
			throw new NotFoundException();
		}
	}
}
