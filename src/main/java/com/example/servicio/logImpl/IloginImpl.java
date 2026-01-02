package com.example.servicio.logImpl;

import com.example.modelo.dtos.UsuarioDTO;
import org.springframework.stereotype.Component;

@Component
public interface IloginImpl {

    public void loginUser(UsuarioDTO usuario);

    public void registerUser(UsuarioDTO usuario);

}

