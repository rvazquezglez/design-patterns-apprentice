package com.nearsoft.apprentice.contract.models;

import java.util.Objects;

public class Producto {
    private String nombreDeProducto;

    public Producto(String nombreDeProducto) {
        this.nombreDeProducto = nombreDeProducto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombreDeProducto='" + nombreDeProducto + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(nombreDeProducto, producto.nombreDeProducto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreDeProducto);
    }

    public String getNombreDeProducto() {
        return nombreDeProducto;
    }

    public void setNombreDeProducto(String nombreDeProducto) {
        this.nombreDeProducto = nombreDeProducto;
    }
}
