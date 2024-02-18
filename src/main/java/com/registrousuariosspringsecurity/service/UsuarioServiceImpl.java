package com.registrousuariosspringsecurity.service;


import com.registrousuariosspringsecurity.dto.UsuarioRegistroDTO;
import com.registrousuariosspringsecurity.entities.Rol;
import com.registrousuariosspringsecurity.entities.Usuario;
import com.registrousuariosspringsecurity.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService{


    @Autowired
    private UsuarioRepository usuarioRep;


    //implementa el metodo de usuario servicio usando regsitroDTO que es para ahcerllo mas seguro
    @Override
    public Usuario saveUser(UsuarioRegistroDTO regisDTO) {
        Usuario usuario = new Usuario(regisDTO.getNombre(),
                regisDTO.getApellido(),
                regisDTO.getEmail(),
                regisDTO.getPassword(), List.of(new Rol("ROLE_USER")));

        return usuarioRep.save(usuario);
    }


    //????
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
