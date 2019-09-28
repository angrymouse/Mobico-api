package br.com.mobico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mobico.domain.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {
	Account findByEmail(String email);
}
