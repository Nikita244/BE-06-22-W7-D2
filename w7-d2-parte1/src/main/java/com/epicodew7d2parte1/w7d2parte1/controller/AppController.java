package com.epicodew7d2parte1.w7d2parte1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.epicodew7d2parte1.w7d2parte1.entities.Utente;
import com.epicodew7d2parte1.w7d2parte1.services.UtenteService;

import java.util.List;


@RestController
@RequestMapping("/app")
public class AppController {
	
	@GetMapping("/data1")
	public String data1() {
		return "Response";
	}
	
	@Autowired
	UtenteService us;
	
	
	///app/data2 -> responselist di arraylist di 4 persone
	@GetMapping("/data2")
	public ResponseEntity<List<Utente>> getAll(){
		List<Utente> utente = us.getAll();
		
		if( utente.isEmpty() ) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(utente, HttpStatus.OK);
	}
	
	///app/data3 -> arraylist di 4 persone
	@RequestMapping(value = "/data3", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Utente>> getAll2(){
		List<Utente> utente = us.getAll();
		
		if( utente.isEmpty() ) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(utente, HttpStatus.OK);
	}
	
}
