package br.com.mobico.repository;

import br.com.mobico.domain.Locality;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class LocalityRepositoryCustomImpl implements LocalityRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Locality> findActiveLocalities() {
        var query = new StringBuilder()
                .append(" Select l from Locality l where l.active is true ")
                .append(" order by ")
                .append(" (CASE WHEN (l.type.id = 3) THEN 1  ") // eventos
                .append("  WHEN (l.type.id = 1) THEN 2 ")   //universidades
                .append(" ELSE 3 END) ")
                .append(" , l.name ");
        return entityManager.createQuery(query.toString(), Locality.class).getResultList();
    }
}
