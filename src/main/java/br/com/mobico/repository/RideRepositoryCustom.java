package br.com.mobico.repository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import br.com.mobico.domain.Profile;
import br.com.mobico.domain.Ride;

public interface RideRepositoryCustom {
	List<Ride> find(Timestamp minimumDepartureTime, Optional<Profile> driver, Optional<Profile> passenger,
			Optional<Integer> originId, Optional<Integer> destinyId);
}
