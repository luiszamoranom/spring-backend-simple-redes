package com.luiszamorano.backendsimpleredes.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.luiszamorano.backendsimpleredes.model.Caracteristica;
import com.luiszamorano.backendsimpleredes.model.Usuario;
import com.luiszamorano.backendsimpleredes.model.id.UsuarioCaracteristicaId;

public interface UsuarioCaracteristica extends JpaRepository<UsuarioCaracteristica,UsuarioCaracteristicaId>{
    List<UsuarioCaracteristica> findByUsuario(Usuario usuario);
    List<UsuarioCaracteristica> findByCaracteristica(Caracteristica caracteristica);
    Boolean existsByUsuario(Usuario usuario);
    Boolean existByCaracteristica(Caracteristica caracteristica);
}
