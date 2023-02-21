package com.epicodew7d2parte1.w7d2parte1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;


import com.epicodew7d2parte1.w7d2parte1.entities.Utente;

public class Beans {
	
	@Bean
    @Scope("prototype")
    public Utente utente(String username, String nome, String password) {
        return Utente.builder()
                .username(username)
                .nome(nome)
                .password(password)
                .build();
    }

}
