package com.example.controlador;

import com.example.modelo.dtos.UsuarioDTO;
import com.example.modelo.entity.Usuario;
import com.example.servicio.usrImpl.IusrImpl;
import com.example.utils.Log;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@Data
public class UsuarioControler {

    private Log log ;

    private IusrImpl iusr ;

    @Autowired
    public UsuarioControler(IusrImpl iusr) {
        this.iusr = iusr;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> inicio(@PathVariable int id) {
        iusr.inicioApp(id);
        return  ResponseEntity.status(HttpStatus.OK).body("usuario");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> putElementos(@PathVariable int id, @RequestBody UsuarioDTO usuarioDTO) {
        iusr.putUsers(id, usuarioDTO);
        return  ResponseEntity.status(HttpStatus.OK).body("usuario");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteElementos(@RequestBody int id){
        iusr.deleteUsers(id);
        return  ResponseEntity.status(HttpStatus.OK).body("usuario");
    }
}
