package com.example.servicio.logImpl;

import com.example.modelo.dtos.UsuarioDTO;
import com.example.modelo.entity.Usuario;
import com.example.repositorio.UsuarioRepository;
import com.example.utils.Log;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class LoginImpl implements IloginImpl {
    private Log log;

    private UsuarioRepository usuarioRepository;

    public LoginImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    /**
     * Podemos usar hibernate para buscar pero seria hacer un sp en la base de datos
     * oh convertimos el dto al entity para busar con jpa el usuario para el login
     *
     * @param usuario
     */
    @Override
    public void loginUser(UsuarioDTO usuario) {
        //Conversion de dto a entity para usar los metodos de jpa
        Usuario user = new Usuario(usuario);

        //Buscar si existe
        boolean valida = usuarioRepository.existsById(user.getId());

        if (!valida) {//Si no existe manda mensaje front de que hay que registrarse
            log.message("Usuario no encontrado, favor de registrarse. ");
        }
        // si existe dar acceso, no recuedo que podriamos hacer

    }

    /**
     * Para registrar se va a incertar directo podemos hacer el sp
     *
     * @param usuario
     */
    @Override
    public void registerUser(UsuarioDTO usuario) {
        //En teoria el usuario no existe
        //Conversion de dto a entity para usar los metodos de jpa
        Usuario user = new Usuario(usuario);

        //Buscar si existe
        boolean valida = usuarioRepository.existsById(user.getId());

        if (!valida) {//DEBE SER FALSE = NO ESTA REGISTRADO
            usuarioRepository.save(user); // guardamos user
        }

    }
}
