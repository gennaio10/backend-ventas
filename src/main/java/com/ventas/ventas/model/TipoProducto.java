package com.ventas.ventas.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class TipoProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipoProducto;

    @NotNull(message = "No puede ser nulo")
    @NotBlank(message = "El codigo es obligatorio")
    @Size(min = 3, max = 15, message = "Debe tener de 3 a 15 caracteres")
    @Column(nullable = false)
    private String codigo;

    @NotNull(message = "No puede ser nulo")
    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 3, max = 250, message = "Debe tener de 3 a 250 caracteres")
    @Column(nullable = false)
    private String nombre;

    public Integer getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(Integer idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
