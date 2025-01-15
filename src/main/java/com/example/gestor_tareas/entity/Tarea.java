package com.example.gestor_tareas.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.util.Date;

@Entity
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "El título es obligatorio")
    private String titulo;

    @Size(max = 255, message = "La descripción no puede exceder 255 caracteres")
    private String descripcion;

    @Min(value = 1, message = "La prioridad debe ser al menos 1")
    @Max(value = 5, message = "La prioridad no puede ser mayor a 5")
    private int prioridad;

    @Future(message = "La fecha de entrega debe ser en el futuro")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}
