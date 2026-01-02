package com.example.modelo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, nullable = false)
    private String nombre;
}
