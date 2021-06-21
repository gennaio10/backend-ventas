package com.ventas.ventas.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPersona;

    @NotNull(message = "No puede ser nulo")
    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 3, max = 150, message = "Debe tener de 3 a 150 caracteres")
    @Column(name = "nombres", nullable = false)
    private String nombres;

    @NotNull(message = "No puede ser nulo")
    @NotBlank(message = "El apellido es obligatorio")
    @Size(min = 3, max = 150, message = "Debe tener de 3 a 150 caracteres")
    @Column(name = "apellidos", nullable = false)
    private String apellidos;

    @NotNull(message = "No puede ser nulo")
    @NotBlank(message = "El direccion es obligatoria")
    @Size(min = 3, max = 150, message = "Debe tener de 3 a 150 caracteres")
    @Column(name = "direccion", nullable = false)
    private String direccion;

    @NotNull(message = "No puede ser nulo")
    @NotBlank(message = "El telefono es obligatorio")
    @Size(min = 10, max = 20, message = "Debe tener de 10 a 20 caracteres")
    @Column(name = "telefono", nullable = false)
    private String telefono;

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
