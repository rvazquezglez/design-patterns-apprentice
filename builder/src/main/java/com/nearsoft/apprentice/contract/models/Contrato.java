package com.nearsoft.apprentice.contract.models;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Contrato {

    private String numeroDeContrato;
    private Date fechaDeInicio;

    private Producto producto;

    private EstatusDeContrato estatusDeContrato;

    private List<Cliente> dueniosDelContrato;
    private List<Cliente> asegurados;

    private MetodoDePago metodoDePago;

    public Contrato() {
    }

    public Contrato(String numeroDeContrato, Date fechaDeInicio, Producto producto, EstatusDeContrato estatusDeContrato, List<Cliente> dueniosDelContrato, List<Cliente> asegurados, MetodoDePago metodoDePago) {
        this.numeroDeContrato = numeroDeContrato;
        this.fechaDeInicio = fechaDeInicio;
        this.producto = producto;
        this.estatusDeContrato = estatusDeContrato;
        this.dueniosDelContrato = dueniosDelContrato;
        this.asegurados = asegurados;
        this.metodoDePago = metodoDePago;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "numeroDeContrato='" + numeroDeContrato + '\'' +
                ", fechaDeInicio=" + fechaDeInicio +
                ", producto=" + producto +
                ", estatusDeContrato=" + estatusDeContrato +
                ", dueniosDelContrato=" + dueniosDelContrato +
                ", asegurados=" + asegurados +
                ", metodoDePago=" + metodoDePago +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contrato contrato = (Contrato) o;
        return Objects.equals(numeroDeContrato, contrato.numeroDeContrato) &&
                Objects.equals(fechaDeInicio, contrato.fechaDeInicio) &&
                Objects.equals(producto, contrato.producto) &&
                estatusDeContrato == contrato.estatusDeContrato &&
                Objects.equals(dueniosDelContrato, contrato.dueniosDelContrato) &&
                Objects.equals(asegurados, contrato.asegurados) &&
                Objects.equals(metodoDePago, contrato.metodoDePago);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroDeContrato, fechaDeInicio, producto, estatusDeContrato, dueniosDelContrato, asegurados, metodoDePago);
    }

    public String getNumeroDeContrato() {
        return numeroDeContrato;
    }

    public void setNumeroDeContrato(String numeroDeContrato) {
        this.numeroDeContrato = numeroDeContrato;
    }

    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public EstatusDeContrato getEstatusDeContrato() {
        return estatusDeContrato;
    }

    public void setEstatusDeContrato(EstatusDeContrato estatusDeContrato) {
        this.estatusDeContrato = estatusDeContrato;
    }

    public List<Cliente> getDueniosDelContrato() {
        return dueniosDelContrato;
    }

    public void setDueniosDelContrato(List<Cliente> dueniosDelContrato) {
        this.dueniosDelContrato = dueniosDelContrato;
    }

    public List<Cliente> getAsegurados() {
        return asegurados;
    }

    public void setAsegurados(List<Cliente> asegurados) {
        this.asegurados = asegurados;
    }

    public MetodoDePago getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(MetodoDePago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }
}
