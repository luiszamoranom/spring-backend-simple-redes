package com.luiszamorano.backendsimpleredes.entity;

import java.util.List;
import java.util.UUID;
import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(updatable = false, nullable = false)
    private UUID id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellidos;

    @Column(nullable = false)
    private Boolean habilitado;

    @Column(nullable = false)
    private Boolean esHombre;

    public Usuario(UUID id, String nombres, String apellidos, Boolean habilitado, Boolean esHombre){
        this.id=id;
        this.nombre=nombres;
        this.apellidos=apellidos;
        this.habilitado=habilitado;
        this.esHombre=esHombre;
    }

    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    List<UsuarioCaracteristica> usuarioCaracteristicas;
}
