package com.luiszamorano.backendsimpleredes.entity;

import com.luiszamorano.backendsimpleredes.entity.id.UsuarioCaracteristicaId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.Data;

@Entity
@Data
public class UsuarioCaracteristica {
    @EmbeddedId
    private UsuarioCaracteristicaId id;

    @ManyToOne
    @MapsId("usuarioId")
    @JoinColumn(nullable = false, updatable = false)
    private Usuario usuario;

    @ManyToOne
    @MapsId("caracteristicaId")
    @JoinColumn(nullable = false, updatable = false)
    private Caracteristica caracteristica;
}
