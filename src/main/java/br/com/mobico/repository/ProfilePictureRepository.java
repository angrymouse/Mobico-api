package br.com.mobico.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mobico.domain.ProfilePicture;

public interface ProfilePictureRepository extends JpaRepository<ProfilePicture, Integer> {
	
	public Optional<ProfilePicture> findByAccountEmail(String email);

	public Optional<ProfilePicture> findByAccountId(Integer accountId);

}
