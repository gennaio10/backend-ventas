package com.ventas.ventas.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;

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

    @NotNull(message = "No puede ser nulo")
    @Column(nullable = false)
    private Double precio;

    @NotNull(message = "No puede ser nulo")
    @ManyToOne
    @JoinColumn(name = "id_tipo_producto", nullable = false)
    private TipoProducto idTipoProducto;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public TipoProducto getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(TipoProducto idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(idProducto, producto.idProducto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProducto);
    }
}
