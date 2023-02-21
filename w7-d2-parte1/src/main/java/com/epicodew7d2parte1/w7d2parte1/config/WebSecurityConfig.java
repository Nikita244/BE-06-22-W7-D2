package com.epicodew7d2parte1.w7d2parte1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.epicodew7d2parte1.w7d2parte1.services.UtenteService;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UtenteService uServ;
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http
		
			.authorizeRequests()
			.antMatchers("/app", "/data2", "/data3")
			.permitAll()
			.anyRequest()
			.authenticated()
			.and()
			.formLogin()
				.successForwardUrl("/login_success")
			.and()
			.logout()
			.and()
			.csrf()
				.disable();

	}
}