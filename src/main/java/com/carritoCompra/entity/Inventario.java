package com.carritoCompra.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Inventario {
    @Getter
    @Setter
    private Integer id;
    @Getter
    @Setter
    private String numero;
    @Getter
    @Setter
    private Date fechaCreacion;
    @Getter
    @Setter
    private Date fechaRecibida;
    @Getter
    @Setter
    private double total;


    //----------------contructores---------------

    public Inventario() {
    }

    public Inventario(Integer id, String numero, Date fechaCreacion, Date fechaRecibida, double totol) {
        this.id = id;
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.fechaRecibida = fechaRecibida;
        this.total = totol;
    }

    //----------------Tostring------------
    @Override
    public String toString() {
        return "Orden{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaRecibida=" + fechaRecibida +
                ", totol=" + total +
                '}';
    }
}
