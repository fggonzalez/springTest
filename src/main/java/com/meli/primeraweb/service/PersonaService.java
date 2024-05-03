package com.meli.primeraweb.service;

import com.meli.primeraweb.entities.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> obtenerTodas();
    Persona obtenerPorId(Long id);

    Persona crearPersona(Persona persona);
    Persona actualizarPersona(Long id,Persona persona);

    void borrarPersona(Long id );

   long contarPersonas();


}

