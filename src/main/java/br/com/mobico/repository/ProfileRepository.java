package br.com.mobico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mobico.domain.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Integer>, ProfileRepositoryCustom {

	public Profile findByAccountEmail(String email);
	
}
