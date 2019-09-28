package br.com.mobico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mobico.domain.Locality;

public interface LocalityRepository extends JpaRepository<Locality, Integer>, LocalityRepositoryCustom {

}
