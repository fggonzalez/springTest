package com.meli.primeraweb.service.impl;

import com.meli.primeraweb.Repository.FacturaRepository;
import com.meli.primeraweb.entities.Factura;
import com.meli.primeraweb.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
     private FacturaRepository facturaRepository;
    @Override
    public Factura CrearFactura(Factura factura) {
        return facturaRepository.save(factura);
    }
    @Override
    public List<Factura> obtenerTodas(){

        return facturaRepository.findAll();
    }

    @Override
    public Factura actualizarFactura(Long id, Factura factura) {
        Factura facturabd=facturaRepository.findById(id).orElse(null);
        if(facturabd !=null){
            facturabd.setElemento(factura.getElemento());
            facturabd.setValor(factura.getValor());
            facturabd.setFecha(factura.getFecha())   ;

        }

        return null;
    }

    @Override
    public Factura obtenerPorID(Long id) {
        return facturaRepository.findById(id).orElse(null);
    }

    @Override
    public long ContarFactura() {
        return 0;
    }

    @Override
    public void borrarFactura(Long ID) {

    }
}
