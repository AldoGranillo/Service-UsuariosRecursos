package com.example.servicio.recImpl;

import com.example.repositorio.UsuarioRepository;
import com.example.utils.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecursoImpl implements IRecursoImpl {
    private UsuarioRepository usuarioRepository;
    private Log log ;
    
    @Autowired
    public RecursoImpl(UsuarioRepository usuarioRepository){
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
