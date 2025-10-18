package com.carritoCompra.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name="productos")

public class Producto {
    @Getter
    @Setter
    private Integer id;
    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private String descripcion;
    @Getter
    @Setter
    private String imagen;
    @Getter
    @Setter
    private String precio;
    @Getter
    @Setter
    private int cantidad;
    @Getter
    @Setter
    private Usuario usuario;
//----------------contructores---------------
    public Producto() {
    }

    public Producto(Integer id, String nombre, String descripcion, String precio, String imagen, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen;
        this.cantidad = cantidad;
    }

    //----------------Tostring------------

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", imagen='" + imagen + '\'' +
                ", precio='" + precio + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
