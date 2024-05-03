package com.meli.primeraweb.service;

import com.meli.primeraweb.entities.Factura;

import java.util.List;

public interface FacturaService {

    List<Factura> obtenerTodas();

    Factura obtenerPorID(Long ID);

    void  borrarFactura(Long ID);

    Factura actualizarFactura(Long ID,Factura factura);
    Factura CrearFactura(Factura factura);

    long  ContarFactura();




}
