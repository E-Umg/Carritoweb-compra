package com.carritoCompra.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name="detalles")
public class DetallePedido {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer id;
    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private double cantidad;
    @Getter
    @Setter
    private double precio;
    @Getter
    @Setter
    private double total;
    //-----------conecxiones de tablas----------------------------
    @Getter
    @Setter
    @ManyToOne
    private Producto producto;
    @Getter
    @Setter
    @OneToOne
    private Pedido pedido;


    //----------------contructores---------------
    public DetallePedido() {
    }

    public DetallePedido(Integer id, String nombre, double cantidad, double precio, double total) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
    }
    //----------------Tostring------------
    @Override
    public String toString() {
        return "DetalleInventario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                ", total=" + total +
                '}';
    }
}
