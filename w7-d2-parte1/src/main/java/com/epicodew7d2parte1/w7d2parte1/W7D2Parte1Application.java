package com.epicodew7d2parte1.w7d2parte1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import com.epicodew7d2parte1.w7d2parte1.config.Beans;
import com.epicodew7d2parte1.w7d2parte1.services.UtenteService;

/*Esercizio #1
Realizzare un servizio Spring Boot attivo sulla porta 8082 che espone i seguenti endpoint GET:
/app/data1   -> response
/app/data2 -> responselist di arraylist di 4 persone
/app/data3 -> arraylist di 4 persone
 * --------------------------------------------------------------------------------------------
Realizzare un servizio Spring Boot attivo sulla porta 8081 che espone i seguenti endpoint:
/os/get-string    contatta :8082/app/data1 e stampa il responso
/os/get-people contatta :8082/app/data3 e stampa il responso
/os/get-people-json contatta :8082/app/data3 e produci il responso JSON
Opzionalmente, proteggere le route tramite autenticazione.
Opzionalmente, agganciare un front-end tramite Live Server e contattare :8082/app/data3 per stampare in console il risultato JSON (occorre abilitare il CORS sul back-end).
Questo è l'esercizio di oggi che sostituisce quello in piattaforma.
@RequestMapping(value = "/data3", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)*/

@SpringBootApplication
@Component
public class W7D2Parte1Application implements CommandLineRunner{
	
	@Autowired
    UtenteService uServ;

	public static void main(String[] args) {
		SpringApplication.run(W7D2Parte1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);

       // Utente u1 = (Utente)ctx.getBean("utente", "andre", "Andrea Neri", "black");
        
       // uServ.save(u1);
        
        ctx.close();

	}

}
