package com.luiszamorano.backendsimpleredes.exceptions.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.luiszamorano.backendsimpleredes.exceptions.exception.UsuarioNoEncontradoException;
import com.luiszamorano.backendsimpleredes.exceptions.exception.UsuarioYaExisteException;
import com.luiszamorano.backendsimpleredes.exceptions.exception.UsuariosNoEncontradosException;

@RestControllerAdvice
public class UsuarioExceptionHandler {
    @ExceptionHandler(UsuariosNoEncontradosException.class)
    public ResponseEntity<Void> handleUsuariosNoEncontradosException() {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @ExceptionHandler(UsuarioNoEncontradoException.class)
    public ResponseEntity<String> handleUsuarioNotFoundException(UsuarioNoEncontradoException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(UsuarioYaExisteException.class)
    public ResponseEntity<String> handleUsuarioYaExisteException(UsuarioYaExisteException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
    }
}

