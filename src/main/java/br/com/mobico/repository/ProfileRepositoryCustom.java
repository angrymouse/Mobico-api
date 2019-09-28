package br.com.mobico.repository;

import java.util.List;

public interface ProfileRepositoryCustom {
    List<Integer> findDistinctUserIdByPassengerOriginOrDestiny(Integer originId, Integer destinationId);

    List<Integer> findIdByPassengersNull();
}
