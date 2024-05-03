package com.meli.primeraweb.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

/*
*Clase Factura  donde se agrega que es un Entity , se Agregan los getter y los setter para encapsular la info
*  y @Id para decir que e sla llave primaria,@GeneratedValue para decir que es una llave autonumerica
*Por medio de HIbernate el va a crear la tabla 
*
 */
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Factura {
    @Id
    @GeneratedValue
    private Long id;
    private Date fecha ;
    private String elemento;
    private double  valor;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getElemento() {
        return elemento;
    }

    public double getValor() {
        return valor;
    }



}
