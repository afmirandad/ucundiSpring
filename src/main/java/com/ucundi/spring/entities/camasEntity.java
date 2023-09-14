package com.ucundi.spring.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class camasEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String tipo;
    private String precio;

    @Override
    public String toString() {
        return "camasEntity{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }

    public camasEntity(String tipo, String precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public camasEntity() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
