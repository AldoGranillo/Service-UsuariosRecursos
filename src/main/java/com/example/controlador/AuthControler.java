package com.example.controlador;


import com.example.modelo.dtos.UsuarioDTO;
import com.example.servicio.logImpl.IloginImpl;
import com.example.utils.Log;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Data
public class AuthControler {
    private Log log ;
    //Esta es la interfaz que voy a inyectar ya que no quiero exponer directamente la capa de negocio

    private IloginImpl ilogin;

    @Autowired
    public AuthControler(IloginImpl ilogin) {
        this.ilogin = ilogin;
    }

    @GetMapping("/")
    public ResponseEntity<?> valida() {
        this.log.message("OK el programa se inicio correctamente :");
        return ResponseEntity.status(HttpStatus.OK).body("OK el programa se inicio correctamente");
    }

    @PostMapping("/auth/login")
    public ResponseEntity<?>  login(@RequestBody UsuarioDTO usuario) {
        this.ilogin.loginUser(usuario);
        return  ResponseEntity.status(HttpStatus.OK).body(usuario);
    }

    @PostMapping("/auth/register")
    public ResponseEntity<?>  register(@RequestBody UsuarioDTO usuario) {
        this.ilogin.registerUser(usuario);
        return  ResponseEntity.status(HttpStatus.OK).body(usuario);
    }

}
