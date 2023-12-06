package com.luiszamorano.backendsimpleredes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luiszamorano.backendsimpleredes.entity.Caracteristica;
import com.luiszamorano.backendsimpleredes.entity.Usuario;
import com.luiszamorano.backendsimpleredes.entity.UsuarioCaracteristica;
import com.luiszamorano.backendsimpleredes.entity.id.UsuarioCaracteristicaId;
import com.luiszamorano.backendsimpleredes.repository.UsuarioCaracteristicaRepository;

@Service
public class UsuarioCaracteristicaService {
    @Autowired
    private UsuarioCaracteristicaRepository usuarioCaracteristicaRepository;

    public List<UsuarioCaracteristica> findAll(){
        return usuarioCaracteristicaRepository.findAll();
    }

    public Optional<UsuarioCaracteristica> findById(UsuarioCaracteristicaId id){
        return usuarioCaracteristicaRepository.findById(id);
    }

    public List<UsuarioCaracteristica> findByUsuario(Usuario usuario){
        return usuarioCaracteristicaRepository.findByUsuario(usuario);
    }

    public List<UsuarioCaracteristica> findByCaracteristicas(Caracteristica caracteristica){
        return usuarioCaracteristicaRepository.findByCaracteristica(caracteristica);
    }

    public Boolean existsById(UsuarioCaracteristicaId id){
        return usuarioCaracteristicaRepository.existsById(id);
    }

    public Boolean existsByUsuario(Usuario usuario){
        return usuarioCaracteristicaRepository.existsByUsuario(usuario);
    }

    public Boolean existsByCaracteristica(Caracteristica caracteristica){
        return usuarioCaracteristicaRepository.existsByCaracteristica(caracteristica);
    }

    public Long count(){
        return usuarioCaracteristicaRepository.count();
    }
    
}
