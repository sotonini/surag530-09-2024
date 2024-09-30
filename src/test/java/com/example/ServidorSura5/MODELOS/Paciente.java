package com.example.ServidorSura5.MODELOS;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //nombres
    private String nombres;
    //anioNacimiento
    private LocalDate fechaNacimiento;
    //ciudad
    private  String cidudad;
    //correo
    private String correo;
    //telefono
    private String telefono;
    //ips
    private String ips;
    //grupo de ingresos
    private String grupoIngresos;
    //boolean tiene poliza
    private Boolean tienePoliza;
    //fechaAfiliacion
    private LocalDate fechaAfiliacion;

    public Paciente() {
    }

    public Paciente(long id, String nombres, LocalDate fechaNacimiento, String cidudad, String correo, String telefono, String ips, String grupoIngresos, Boolean tienePoliza, LocalDate fechaAfiliacion) {
        this.id = id;
        this.nombres = nombres;
        this.fechaNacimiento = fechaNacimiento;
        this.cidudad = cidudad;
        this.correo = correo;
        this.telefono = telefono;
        this.ips = ips;
        this.grupoIngresos = grupoIngresos;
        this.tienePoliza = tienePoliza;
        this.fechaAfiliacion = fechaAfiliacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCidudad() {
        return cidudad;
    }

    public void setCidudad(String cidudad) {
        this.cidudad = cidudad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getGrupoIngresos() {
        return grupoIngresos;
    }

    public void setGrupoIngresos(String grupoIngresos) {
        this.grupoIngresos = grupoIngresos;
    }

    public Boolean getTienePoliza() {
        return tienePoliza;
    }

    public void setTienePoliza(Boolean tienePoliza) {
        this.tienePoliza = tienePoliza;
    }

    public LocalDate getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    public void setFechaAfiliacion(LocalDate fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }
}
