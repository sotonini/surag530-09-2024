package com.example.ServidorSura5.MODELOS;

import jakarta.persistence.*;

import java.time.LocalDate;
    @Entity
    @Table(name="medicamentos")
public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String presentacion;
    private String dosis;
    private String laboratorio;
    private LocalDate fecheCaducidad;
    private String contraindicaciones;
    private String registro;
    private Boolean tieneCoopago;

    public Medicamento() {
    }

    public Medicamento(Long id, String nombre, String presentacion, String dosis, String laboratorio, LocalDate fecheCaducidad, String contraindicaciones, String registro, Boolean tieneCoopago) {
        this.id = id;
        this.nombre = nombre;
        this.presentacion = presentacion;
        this.dosis = dosis;
        this.laboratorio = laboratorio;
        this.fecheCaducidad = fecheCaducidad;
        this.contraindicaciones = contraindicaciones;
        this.registro = registro;
        this.tieneCoopago = tieneCoopago;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public LocalDate getFecheCaducidad() {
        return fecheCaducidad;
    }

    public void setFecheCaducidad(LocalDate fecheCaducidad) {
        this.fecheCaducidad = fecheCaducidad;
    }

    public String getContraindicaciones() {
        return contraindicaciones;
    }

    public void setContraindicaciones(String contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public Boolean getTieneCoopago() {
        return tieneCoopago;
    }

    public void setTieneCoopago(Boolean tieneCoopago) {
        this.tieneCoopago = tieneCoopago;
    }
}
