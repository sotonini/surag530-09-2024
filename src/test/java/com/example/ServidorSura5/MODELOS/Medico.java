package com.example.ServidorSura5.MODELOS;

import jakarta.persistence.*;

@Entity
@Table(name="medicos")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    private String matriculaProfesionl;
    private String especialidad;
    private Integer salario;
    private String ips;
    private String Correo;
    private String Telefono;
    private String direccion;
    private Boolean disponibleFindesemana;

    public Medico() {
    }

    public Medico(Long id, String nombres, String matriculaProfesionl, String especialidad, Integer salario, String ips, String correo, String telefono, String direccion, Boolean disponibleFindesemana) {
        this.id = id;
        this.nombres = nombres;
        this.matriculaProfesionl = matriculaProfesionl;
        this.especialidad = especialidad;
        this.salario = salario;
        this.ips = ips;
        Correo = correo;
        Telefono = telefono;
        this.direccion = direccion;
        this.disponibleFindesemana = disponibleFindesemana;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getMatriculaProfesionl() {
        return matriculaProfesionl;
    }

    public void setMatriculaProfesionl(String matriculaProfesionl) {
        this.matriculaProfesionl = matriculaProfesionl;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getDisponibleFindesemana() {
        return disponibleFindesemana;
    }

    public void setDisponibleFindesemana(Boolean disponibleFindesemana) {
        this.disponibleFindesemana = disponibleFindesemana;
    }
}
