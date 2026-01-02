package com.example.excepciones.custom;

public class ArchivoInvalidoException extends RuntimeException {
    public ArchivoInvalidoException(String message) {
        super(message);
    }
}
