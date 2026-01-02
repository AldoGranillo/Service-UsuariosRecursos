package com.example.servicio.archiImpl;

import com.example.repositorio.UsuarioRepository;
import com.example.utils.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArchivoImpl implements IArchImpl {
    private UsuarioRepository usuarioRepository;
    private Log log ;
    
    @Autowired
    public ArchivoImpl(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public void inicioApp() {

    }

    @Override
    public void putUsers() {

    }

    @Override
    public void deleteUsers() {

    }
}
