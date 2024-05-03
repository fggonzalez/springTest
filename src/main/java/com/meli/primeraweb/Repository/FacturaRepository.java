package com.meli.primeraweb.Repository;

import com.meli.primeraweb.entities.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends  JpaRepository<Factura,Long> {
}
