package com.luiszamorano.backendsimpleredes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.luiszamorano.backendsimpleredes.dto.Usuario.UsuarioFindByUUIDDTO;
import com.luiszamorano.backendsimpleredes.entity.Usuario;
import com.luiszamorano.backendsimpleredes.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/todos") 
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }

    @GetMapping("/buscar_por_uuid") 
    public Usuario findByUUID(@RequestBody UsuarioFindByUUIDDTO usuarioDTO){
        return usuarioService.findById(usuarioDTO.getUuid());
    }

    @GetMapping("/habilitados")
    public List<Usuario> habilitados(){
        return usuarioService.findByHabilitado(true);
    }

    @GetMapping("/deshabilitados")
    public List<Usuario> deshabilitados(){
        return usuarioService.findByHabilitado(false);
    }

    @GetMapping("/hombres")
    public List<Usuario> hombres(){
        return usuarioService.findByEsHombre(true);
    }

    @GetMapping("/mujeres")
    public List<Usuario> mujeres(){
        return usuarioService.findByEsHombre(false);
    }

    @GetMapping("/hombres_habilitados")
    public List<Usuario> hombres_habilitados(){
        return usuarioService.findByHabilitadoAndEsHombre(true, true);
    }

    @GetMapping("/hombres_deshabilitados")
    public List<Usuario> hombres_deshabilitados(){
        return usuarioService.findByHabilitadoAndEsHombre(false, true);
    }

    @GetMapping("/mujeres_habilitadas")
    public List<Usuario> mujeres_habilitadas(){
        return usuarioService.findByHabilitadoAndEsHombre(true, false);
    }

    @GetMapping("/mujeres_deshabilitadas")
    public List<Usuario> mujeres_deshabilitadas(){
        return usuarioService.findByHabilitadoAndEsHombre(false, false);
    }
}
