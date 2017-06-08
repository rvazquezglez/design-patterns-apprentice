package com.nearsoft.apprentice.contract.models;

import java.util.Objects;

public class MetodoDePago {

    private TiposMetodoDePago tipo;

    public MetodoDePago(TiposMetodoDePago tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "MetodoDePago{" +
                "tipo=" + tipo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetodoDePago that = (MetodoDePago) o;
        return tipo == that.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo);
    }

    public TiposMetodoDePago getTipo() {
        return tipo;
    }

    public void setTipo(TiposMetodoDePago tipo) {
        this.tipo = tipo;
    }
}
