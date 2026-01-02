package com.example.excepciones.custom;

public class RecursoNoValidoException extends RuntimeException {
    public RecursoNoValidoException(String message) {
        super(message);
    }
}
