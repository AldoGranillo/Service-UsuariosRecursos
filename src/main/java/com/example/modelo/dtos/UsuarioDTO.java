package com.example.modelo.dtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UsuarioDTO {
    private int id;
    private String username;
    private String email;
    private String password;
    private Boolean enable;
    private LocalDateTime created_at;
    private LocalDateTime update_at;
}