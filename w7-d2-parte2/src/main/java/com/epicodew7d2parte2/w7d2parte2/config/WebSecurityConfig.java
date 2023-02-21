package com.epicodew7d2parte2.w7d2parte2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/os/get-string", "/os/get-people", "/os/get-people-json")
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
