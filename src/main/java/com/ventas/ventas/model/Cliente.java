package com.ventas.ventas.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;

    @NotNull(message = "No puede ser nulo")
    @NotBlank(message = "El nit es obligatorio")
    @Size(min = 3, max = 50, message = "Debe tener de 3 a 50 caracteres")
    @Column(name = "nit", nullable = false)
    private String nit;

    @NotNull(message = "No puede ser nulo")
    @NotBlank(message = "La razon social es obligatoria")
    @Size(min = 3, max = 150, message = "Debe tener de 3 a 150 caracteres")
    @Column(name = "razon_social", nullable = false)
    private String razon_social;

    @NotNull(message = "No puede ser nulo")
    @NotBlank(message = "El email es obligatorio")
    @Size(min = 10, max = 150, message = "Debe tener de 10 a 150 caracteres")
    @Email(message = "El email no tiene un formato valido")
    @Column(nullable = false)
    private String email;

    @NotNull(message = "No puede ser nulo")
    @OneToOne
    @JoinColumn(name = "id_persona", nullable = false)
    private Persona idPersona;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(idCliente, cliente.idCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente);
    }
}
