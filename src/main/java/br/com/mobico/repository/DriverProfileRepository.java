package br.com.mobico.repository;

import br.com.mobico.domain.DriverProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverProfileRepository extends JpaRepository<DriverProfile, Integer> {

	DriverProfile findByAccountEmail(String email);
	
}
