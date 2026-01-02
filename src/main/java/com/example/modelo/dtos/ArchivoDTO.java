package com.example.modelo.dtos;

import com.example.modelo.entity.Recurso;
import lombok.Data;

@Data
public class ArchivoDTO {

    private int id;
    private String nombre;
    private String tipo;
    private String ruta;
    private int recurso_id;
}
