package com.example.controlador;

import com.example.modelo.dtos.RecursoDTO;
import com.example.modelo.entity.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recursos")
public class RecursoControler {
    @PostMapping
    private  ResponseEntity<?> registrar(@RequestBody RecursoDTO recursoDTO) {
        return  ResponseEntity.status(HttpStatus.OK).body(recursoDTO);
    }

    @GetMapping
    public ResponseEntity<?> listar(){
        return  ResponseEntity.status(HttpStatus.OK).body("usuario");
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> recuperar(@PathVariable Integer id){
        return  ResponseEntity.status(HttpStatus.OK).body("usuario");
    }

    @PutMapping("/{id}")
    public  ResponseEntity<?> editar(@PathVariable Integer id){
        return  ResponseEntity.status(HttpStatus.OK).body("usuario");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        return  ResponseEntity.status(HttpStatus.OK).body("usuario");
    }

}
