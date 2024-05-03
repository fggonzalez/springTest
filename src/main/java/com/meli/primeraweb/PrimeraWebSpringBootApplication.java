package com.meli.primeraweb;

import com.meli.primeraweb.Repository.PersonaRepository;
import com.meli.primeraweb.entities.Persona;
import com.meli.primeraweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PrimeraWebSpringBootApplication  {

	@Autowired
	private PersonaService personaService;

	public static void main(String[] args) {SpringApplication.run(PrimeraWebSpringBootApplication.class);



	}

	/*@Override
	public void run(String... args) throws Exception {

		personaService.crearPersona(new Persona(5l,"Milena Rodriguez",30,"Colombiano"));
		personaService.crearPersona(new Persona(6l,"Lina Marcela ",30,"Colombiano"));
		//personaRepository.save(new Persona(2l,"Andres",18,"Colombiano"));
		//personaRepository.save(new Persona(3l,"Pepe oviedo",18,"Japones"));
		//personaRepository.save(new Persona(4l,"Oscar oviedo",18,"Peruano"));
		System.out.println("Numero de personas guardada"+personaService.contarPersonas());

		//Mostramos la lista de personas
		List<Persona> personas = personaService.obtenerTodas();
		personas.forEach(p-> System.out.println("Nombre de la persona"+p.getNombre()));
	}*/
}

