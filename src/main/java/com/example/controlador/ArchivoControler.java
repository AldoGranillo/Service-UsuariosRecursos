package com.example.controlador;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ArchivoControler {

    @PostMapping(value = "recursos/{id}/archivo")
    private  ResponseEntity<?> registrarFile(@PathVariable Integer id,@RequestParam("archivo") MultipartFile archivo) {
        return  ResponseEntity.status(HttpStatus.OK).body("usuario");
    }

    @GetMapping("archivos/{id}")
    public  ResponseEntity<?> listar(@PathVariable Integer id){
        return  ResponseEntity.status(HttpStatus.OK).body("usuario");
    }
}
