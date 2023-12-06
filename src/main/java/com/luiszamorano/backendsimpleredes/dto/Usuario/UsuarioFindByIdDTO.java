package com.luiszamorano.backendsimpleredes.dto.Usuario;

import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UsuarioFindByIdDTO {
    @NotNull
    private UUID id;

}
