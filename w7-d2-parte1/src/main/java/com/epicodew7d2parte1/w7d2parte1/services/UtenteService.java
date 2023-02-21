package com.epicodew7d2parte1.w7d2parte1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicodew7d2parte1.w7d2parte1.entities.Utente;
import com.epicodew7d2parte1.w7d2parte1.repository.UtenteRepository;


@Service
public class UtenteService {
	
	@Autowired
	private UtenteRepository utenteRepo;
	
	public Utente save(Utente obj) {
		return utenteRepo.save(obj);
	}
	
	public List<Utente> getAll() {
		return utenteRepo.findAll();
	}
}
