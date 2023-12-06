package com.luiszamorano.backendsimpleredes.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.luiszamorano.backendsimpleredes.entity.Caracteristica;
import com.luiszamorano.backendsimpleredes.entity.Usuario;
import com.luiszamorano.backendsimpleredes.entity.UsuarioCaracteristica;
import com.luiszamorano.backendsimpleredes.entity.id.UsuarioCaracteristicaId;

public interface UsuarioCaracteristicaRepository extends JpaRepository<UsuarioCaracteristica,UsuarioCaracteristicaId>{
    List<UsuarioCaracteristica> findByUsuario(Usuario usuario);
    List<UsuarioCaracteristica> findByCaracteristica(Caracteristica caracteristica);
    Boolean existsByUsuario(Usuario usuario);
    Boolean existsByCaracteristica(Caracteristica caracteristica);
}
