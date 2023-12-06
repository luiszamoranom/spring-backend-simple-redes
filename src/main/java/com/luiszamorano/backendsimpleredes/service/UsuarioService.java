package com.luiszamorano.backendsimpleredes.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luiszamorano.backendsimpleredes.entity.Usuario;
import com.luiszamorano.backendsimpleredes.exceptions.exception.UsuarioNoEncontradoException;
import com.luiszamorano.backendsimpleredes.exceptions.exception.UsuariosNoEncontradosException;
import com.luiszamorano.backendsimpleredes.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll(){
        List<Usuario> usuarios = usuarioRepository.findAll();
        if(usuarios.size() == 0){
            throw new UsuariosNoEncontradosException();
        }
        return usuarios;
    }

    public Usuario findById(UUID id){
        Optional<Usuario> posibleUsuario = usuarioRepository.findById(id);
        if(!posibleUsuario.isPresent()){
            throw new UsuarioNoEncontradoException("Usuario no encontrado con ese 'uuid'");
        }
        return posibleUsuario.get();
    }

    public List<Usuario> findByHabilitado(Boolean habilitado){
        List<Usuario> usuarios = usuarioRepository.findByHabilitado(habilitado);
        if(usuarios.size() == 0){
            throw new UsuariosNoEncontradosException();
        }
        return usuarios;
    }

    public List<Usuario> findByEsHombre(Boolean esHombre){
        List<Usuario> usuarios = usuarioRepository.findByEsHombre(esHombre);
        if(usuarios.size() == 0){
            throw new UsuariosNoEncontradosException();
        }
        return usuarios;
    }

    public List<Usuario> findByHabilitadoAndEsHombre(Boolean habilitado, Boolean esHombre){
        List<Usuario> usuarios = usuarioRepository.findByHabilitadoAndEsHombre(habilitado, esHombre);
        if(usuarios.size() == 0){
            throw new UsuariosNoEncontradosException();
        }
        return usuarios;
    }

    public Boolean existsById(UUID id){
        return usuarioRepository.existsById(id);
    }

    public Long count(){
        return usuarioRepository.count();
    }
}
