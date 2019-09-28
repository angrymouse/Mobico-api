package br.com.mobico.security;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

/**
 * Classe de configuração da segurança da Web API
 */

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	/** Especifica os modos de acesso e as restrições de autenticação por URL */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().and().csrf().disable().authorizeRequests()
				.antMatchers(HttpMethod.POST, SecurityConstants.SIGN_UP_URL).permitAll()
				.antMatchers(HttpMethod.POST, SecurityConstants.RESET_PASSWORD_URL).permitAll()
				//.antMatchers(HttpMethod.GET, SecurityConstants.DOCUMENTATION_URL).permitAll()    //TODO
				.antMatchers(HttpMethod.POST, SecurityConstants.TEST_ENDPOINT).permitAll() //TODO
				.antMatchers(HttpMethod.POST, SecurityConstants.EMAIL_VERIFICATION_URL).permitAll()
				.antMatchers(HttpMethod.POST, SecurityConstants.LOGIN_URL).permitAll()
				.anyRequest().authenticated()
				.and().addFilter(new JWTAuthenticationFilter(authenticationManager()))
				.addFilter(new JWTAuthorizationFilter(authenticationManager()))
				// Desabilita criação de sessão
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
	
	
	/**
	 * Configura o spring security para usar nosso {@link UserDetailsServiceImpl}}
	 * */
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
	}

	
	/**
	 * TODO Analisar o impacto do uso de Cors na segurança da aplicação 
	 * */
	@Bean
	CorsConfigurationSource corsConfigurationSource() { 
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource(); 
		var config = new CorsConfiguration();
		config.applyPermitDefaultValues();
		
		config.setAllowedOrigins(Collections.unmodifiableList(Arrays.asList(CorsConfiguration.ALL)));
		config.setAllowedMethods(
				Collections.unmodifiableList(Arrays.asList(
						HttpMethod.GET.name(), 
						HttpMethod.HEAD.name(), 
						HttpMethod.POST.name(), 
						HttpMethod.PUT.name(),
						HttpMethod.DELETE.name()
				)));
		config.setAllowedHeaders(Collections.unmodifiableList(Arrays.asList(CorsConfiguration.ALL)));
		config.setMaxAge(1800L);
		
		config.setAllowCredentials(true);
		config.addExposedHeader("Authorization");
        config.addExposedHeader("Content-Type");
		source.registerCorsConfiguration("/**", config); 
		return source; 
	} 
}
