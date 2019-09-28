package br.com.mobico.repository;

import br.com.mobico.domain.Van;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VanRepository extends JpaRepository<Van, Integer> {
	List<Van> findByActiveTrueAndDriverProfileId(Integer id);
}
