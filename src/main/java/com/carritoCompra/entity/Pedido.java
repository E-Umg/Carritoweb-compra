package com.carritoCompra.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Entity
@Table(name="pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
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
    //-----------conecxiones de tablas----------------------------
    @Getter
    @Setter
    @ManyToOne
    private Usuario usuario;
    @Getter
    @Setter
    @OneToOne (mappedBy = "pedido")
    private DetallePedido detalle;

    //----------------contructores---------------

    public Pedido() {
    }

    public Pedido(Integer id, String numero, Date fechaCreacion, Date fechaRecibida, double totol) {
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
