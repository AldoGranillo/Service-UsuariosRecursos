package com.example.modelo.dtos;

import com.example.modelo.entity.Usuario;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RecursoDTO {

    private int id;
    private String nombre;
    private String descripcion;
    private String estado;
    private int usuario_id;
    private LocalDateTime created_id;
}
