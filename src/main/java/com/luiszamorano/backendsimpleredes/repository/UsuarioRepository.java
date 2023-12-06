package com.luiszamorano.backendsimpleredes.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import com.luiszamorano.backendsimpleredes.entity.Usuario;
import java.util.List;


public interface UsuarioRepository extends JpaRepository<Usuario,UUID>{
    List<Usuario> findByHabilitado(Boolean habilitado);
    List<Usuario> findByEsHombre(Boolean esHombre);
    List<Usuario> findByHabilitadoAndEsHombre(Boolean habilitado, Boolean esHombre);
}
