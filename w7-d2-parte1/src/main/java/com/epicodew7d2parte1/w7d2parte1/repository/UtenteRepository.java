package com.epicodew7d2parte1.w7d2parte1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicodew7d2parte1.w7d2parte1.entities.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer>{
	
	
}
