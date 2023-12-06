package com.luiszamorano.backendsimpleredes.model.pk;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class UsuarioCaracteristicaId {
    @Column
    private UUID usuarioId;

    @Column 
    private String caracteristicaId;
}
