package com.example.servicio.usrImpl;

import com.example.modelo.dtos.UsuarioDTO;

public interface IusrImpl {
    public void inicioApp(int id);

    public void putUsers(int id, UsuarioDTO usuarioDTO);

    public void deleteUsers(int id);
}
