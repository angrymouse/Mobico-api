package br.com.mobico.security;

import static java.util.Collections.emptyList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.mobico.domain.Account;
import br.com.mobico.repository.AccountRepository;

/**
 * Serviço customizado para retornar o usuário logado
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private AccountRepository applicationUserRepository;

	@Override
	public UserDetails loadUserByUsername(String username) {
		Account account = applicationUserRepository.findByEmail(username);
		if (account == null) {
			throw new UsernameNotFoundException(username);
		}
		return new org.springframework.security.core.userdetails.User(account.getEmail(), account.getPassword(),
				emptyList());
	}
}
