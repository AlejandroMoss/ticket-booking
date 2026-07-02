package com.mosscompanysas.infrastructure.adapters.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "ejemplos")
public class EjemploEntity {

    @Id
    @Column(name = "id", length = 36)
    private String id;

    @Column(nullable = false)
    private String nombre;

    @Column(name = "creado_en", updatable = false)
    private LocalDateTime creadoEn;

    @Column(nullable = false)
    private boolean activo;

    public EjemploEntity() {}

    public EjemploEntity(String id, String nombre, LocalDateTime creadoEn, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.creadoEn = creadoEn;
        this.activo = activo;
    }

    // Getters y setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public LocalDateTime getCreadoEn() { return creadoEn; }
    public void setCreadoEn(LocalDateTime creadoEn) { this.creadoEn = creadoEn; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }
}
