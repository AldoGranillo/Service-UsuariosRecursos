package com.example.modelo.entity;

import com.example.modelo.dtos.UsuarioDTO;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Boolean enable;

    private LocalDateTime created_at;

    private LocalDateTime update_at;

    public Usuario(UsuarioDTO usuarioDTO) {
        this.username = usuarioDTO.getUsername();
        this.email = usuarioDTO.getEmail();
        this.password = usuarioDTO.getPassword();
        this.enable = usuarioDTO.getEnable();
        this.created_at = usuarioDTO.getCreated_at();
        this.update_at = usuarioDTO.getUpdate_at();
    }

    public Usuario() {

    }
}
