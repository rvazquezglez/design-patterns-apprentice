package com.nearsoft.apprentice.contract.models;

import java.util.Objects;

public class Cliente {

    private String nombre;
    private String apellido;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nombre, cliente.nombre) &&
                Objects.equals(apellido, cliente.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
