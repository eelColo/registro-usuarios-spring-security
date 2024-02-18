package com.registrousuariosspringsecurity.Controller;


import com.registrousuariosspringsecurity.dto.UsuarioRegistroDTO;
import com.registrousuariosspringsecurity.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class RegistroUsuarioControllador {

    @Autowired
    private UsuarioService usuarioService;


    //cuando carga agrega el usuario a la vista
    @ModelAttribute("usuario")
    public UsuarioRegistroDTO returnNuevoUsuarioRegistroDTO(){
        return new UsuarioRegistroDTO();
    }

    //cuando carga envia a registro
    @GetMapping()
    public String mostrarFormularioDeRegistro(){

        return "registro";
    }
    @PostMapping()
    public String registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO){
        usuarioService.saveUser(registroDTO);
        return "redirect:/registro?exito";
    }


}
