package com.example.servicio.usrImpl;

import com.example.modelo.dtos.UsuarioDTO;
import com.example.modelo.entity.Usuario;
import com.example.repositorio.UsuarioRepository;
import com.example.utils.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsrImpl implements IusrImpl{
    private UsuarioRepository usuarioRepository;
    private Log log ;

    @Autowired
    public UsrImpl(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public void inicioApp(int id) {
        boolean existe = usuarioRepository.existsById(id);
        if(existe){
           // aca ya vendria alguna validacion cual no se
        }

    }

    @Override
    public void putUsers(int id, UsuarioDTO usuarioDTO) {
        boolean existe = usuarioRepository.existsById(id);
        if(existe) {
            //ACA LOS CAMPOS QUE NO SE PUEDEN MODIFICAR LO AJUSTAMOS DESDE EL FRONT PARA QUE CUANDO
            //EL USER SE QUIERA UPDATE SOLO LE DEJE MOVER LO PERMITIDO Y ASI AL BACK LLEGAN LOS CAMPOS DE INTERES
            Usuario user = new Usuario(usuarioDTO);
            usuarioRepository.save(user);
        }

    }

    @Override
    public void deleteUsers(int id) {

    }
}
