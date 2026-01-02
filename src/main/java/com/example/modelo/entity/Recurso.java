package com.example.modelo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "recurso")
public class Recurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, nullable = false)
    private String nombre;

    private String descripcion;

    private String estado;


    @ManyToOne
    @JoinColumn(referencedColumnName = "id", nullable = false)
    private Usuario usuario_id;

    private LocalDateTime created_id;
}
