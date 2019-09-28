package br.com.mobico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mobico.domain.Van;

public interface VanRepository extends JpaRepository<Van, Integer> {
	List<Van> findByActiveTrueAndProfileId(Integer id);
}
