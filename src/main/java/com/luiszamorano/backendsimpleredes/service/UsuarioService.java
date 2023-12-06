package com.luiszamorano.backendsimpleredes.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luiszamorano.backendsimpleredes.entity.Usuario;
import com.luiszamorano.backendsimpleredes.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> findById(UUID id){
        return usuarioRepository.findById(id);
    }

    public Boolean existsById(UUID id){
        return usuarioRepository.existsById(id);
    }

    public Long count(){
        return usuarioRepository.count();
    }
}
