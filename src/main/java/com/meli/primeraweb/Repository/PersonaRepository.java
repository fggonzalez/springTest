package com.meli.primeraweb.Repository;

import com.meli.primeraweb.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//Anotaciones de tipo Estereotipo
public interface PersonaRepository extends JpaRepository<Persona,Long> {
}
