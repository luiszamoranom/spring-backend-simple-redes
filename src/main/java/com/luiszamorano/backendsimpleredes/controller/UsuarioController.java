package com.luiszamorano.backendsimpleredes.controller;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.luiszamorano.backendsimpleredes.dto.Usuario.UsuarioFindByUUIDDTO;
import com.luiszamorano.backendsimpleredes.entity.Usuario;
import com.luiszamorano.backendsimpleredes.service.UsuarioService;

@RestController
@Validated
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios") 
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }

    @PostMapping("/buscar_por_uuid") 
    public Usuario findByUUID(@RequestBody UsuarioFindByUUIDDTO usuarioDTO){
        return usuarioService.findById(usuarioDTO.getUuid());
    }
}
