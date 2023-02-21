package com.epicodew7d2parte2.w7d2parte2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/*Realizzare un servizio Spring Boot attivo sulla porta 8081 che espone i seguenti endpoint:
/os/get-string    contatta :8082/app/data1 e stampa il responso
/os/get-people contatta :8082/app/data3 e stampa il responso
/os/get-people-json contatta :8082/app/data3 e produci il responso JSON
Opzionalmente, proteggere le route tramite autenticazione.
Opzionalmente, agganciare un front-end tramite Live Server e contattare :8082/app/data3 per stampare in console il risultato JSON (occorre abilitare il CORS sul back-end).
Questo è l'esercizio di oggi che sostituisce quello in piattaforma.
@RequestMapping(value = "/data3", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)*/

@RestController
@RequestMapping("/os")
public class OtherServiceController {
	
	
	//os/get-string    contatta :8082/app/data1 e stampa il responso
	@GetMapping("/get-string")
    public String m1() {

        RestTemplate rt = new RestTemplate();
        String rtUrl = "http://localhost:8082/app/data1";
        ResponseEntity<String> response = rt.getForEntity(rtUrl, String.class);
        return "response: \"" + response.getBody() + "\"";

    }



    
    //os/get-people contatta :8082/app/data3 e stampa il responso
    @GetMapping("/get-people")
    public String m2() {

        RestTemplate rt = new RestTemplate();
        String rtUrl = "http://localhost:8082/app/data3";
        String response = rt.getForObject(rtUrl, String.class);
        return "people list: " + response;

    }

    ///os/get-people-json contatta :8082/app/data3 e produci il responso JSON
    @GetMapping("/get-people-json")
    public Object m2Json() {
        RestTemplate rt = new RestTemplate();
        String rtUrl = "http://localhost:8082/app/data3";
        Object response = rt.getForObject(rtUrl, Object.class);
        return response;

    }


}
