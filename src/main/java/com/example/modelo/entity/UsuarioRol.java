package com.example.modelo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "usuario_rol")
@IdClass(UsuarioRol.class)
public class UsuarioRol {

    @Id
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", nullable = false)
    private Usuario usuario_id;

    @Id
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", nullable = false)
    private Rol rol_id;
}
