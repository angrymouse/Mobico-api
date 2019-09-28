package br.com.mobico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mobico.domain.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
