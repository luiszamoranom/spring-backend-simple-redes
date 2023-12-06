package com.luiszamorano.backendsimpleredes.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.luiszamorano.backendsimpleredes.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,UUID>{
}
