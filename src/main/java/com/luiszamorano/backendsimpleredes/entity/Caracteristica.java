package com.luiszamorano.backendsimpleredes.model;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Caracteristica {
    @Id
    @Column(updatable = false, nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String urlIcono;

    @OneToMany(mappedBy = "caracteristica", fetch = FetchType.LAZY)
    List<UsuarioCaracteristica> usuarioCaracteristicas;
}
