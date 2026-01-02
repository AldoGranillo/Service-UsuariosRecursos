package com.example.modelo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="archivo")
public class Archivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, nullable = false)
    private String nombre;

    private String tipo;

    @Column(nullable = false)
    private String ruta;


    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Recurso recurso_id;
}
