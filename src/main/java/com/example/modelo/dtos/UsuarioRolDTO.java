package com.example.modelo.dtos;

import com.example.modelo.entity.Rol;
import com.example.modelo.entity.Usuario;
import lombok.Data;

@Data
public class UsuarioRolDTO {
    private int usuario_id;
    private int rol_id;
}
