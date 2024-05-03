package com.meli.primeraweb.service.impl;

import com.meli.primeraweb.Repository.PersonaRepository;
import com.meli.primeraweb.entities.Persona;
import com.meli.primeraweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class PersonaServiceImpl implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> obtenerTodas() {

        return personaRepository.findAll();
    }

    @Override
    public Persona obtenerPorId(Long id) {

        return personaRepository.findById(id).orElse(null);
    }



    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona actualizarPersona(Long id, Persona persona) {
        Persona personaBBdd = personaRepository.findById(id).orElse(null);
        if (personaBBdd != null) {
            personaBBdd.setNombre(persona.getNombre());
            personaBBdd.setEdad(persona.getEdad());
            personaBBdd.setNacionalidad(persona.getNacionalidad());
            return personaRepository.save(personaBBdd);


        }
        return null;
    }

    @Override
    public void borrarPersona(Long id) {
        personaRepository.deleteById(id);

    }

    @Override
    public long contarPersonas() {
        return personaRepository.count();
    }

}
