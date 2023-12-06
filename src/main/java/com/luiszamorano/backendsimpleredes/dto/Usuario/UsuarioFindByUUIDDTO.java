package com.luiszamorano.backendsimpleredes.dto.Usuario;

import java.util.UUID;
import javax.validation.constraints.NotNull;
import com.luiszamorano.backendsimpleredes.validators.interfaces.TipoUUID;

import lombok.Data;


@Data
public class UsuarioFindByUUIDDTO {
    private UUID uuid;
}
