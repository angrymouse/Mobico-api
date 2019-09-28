package br.com.mobico.repository;

import br.com.mobico.domain.Locality;

import java.util.List;

public interface LocalityRepositoryCustom {
    List<Locality> findActiveLocalities();
}
