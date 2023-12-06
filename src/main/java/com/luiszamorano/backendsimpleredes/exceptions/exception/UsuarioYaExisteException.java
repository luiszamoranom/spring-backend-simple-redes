package com.luiszamorano.backendsimpleredes.exceptions.exception;

public class UsuarioYaExisteException extends RuntimeException{
    public UsuarioYaExisteException(String message){
        super(message);
    }
}
