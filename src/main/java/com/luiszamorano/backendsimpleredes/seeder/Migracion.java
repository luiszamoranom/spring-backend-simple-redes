package com.luiszamorano.backendsimpleredes.seeder;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luiszamorano.backendsimpleredes.service.UsuarioService;

import jakarta.annotation.PostConstruct;

@Service
public class Migracion {
    @Autowired
    private UsuarioService usuarioService;

    public static UUID generarUUID() {
        return UUID.randomUUID();
    }

    @PostConstruct
    public void seed(){
        for(int i=0; i<20; i++){
            Boolean habilitado = Math.random() < 0.5 ? true : false;
            Boolean esHombre = Math.random() < 0.5 ? true : false;
            String nombres = esHombre ? "Nombres de Hombre "+i : "Nombres de Mujer "+i;
            String apellidos = esHombre ? "Apellidos de Hombre" +i : "Apellidos de Mujer "+i;
            usuarioService.save(generarUUID(), nombres, apellidos, habilitado, esHombre);
        }
    }


}
