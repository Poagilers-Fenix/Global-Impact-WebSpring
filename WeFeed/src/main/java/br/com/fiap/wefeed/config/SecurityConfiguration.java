package br.com.fiap.wefeed.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import br.com.fiap.wefeed.service.AuthenticationService;

//import br.com.fiap.epictask.controller.api.AuthorizationFilter;
//import br.com.fiap.epictask.repository.UserRepository;
//import br.com.fiap.epictask.service.AuthenticationService;
//import br.com.fiap.epictask.service.TokenService;


public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private AuthenticationService authenticationService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(authenticationService)
			.passwordEncoder(AuthenticationService.getPasswordEncoder())
			;
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/home/**", "/user")
				.authenticated()
			.antMatchers("/user/**")
				.hasRole("ADMIN")
			.anyRequest()
				.permitAll()
			.and()
				.formLogin()
				.loginPage("/login")
				.defaultSuccessUrl("/home")
			.and()
				.logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
				.logoutSuccessUrl("/")
			.and()
				.csrf()
				.disable()
			.headers()
				.frameOptions()
				.disable()
			;
	}

}
