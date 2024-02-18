package com.registrousuariosspringsecurity.service;

import com.registrousuariosspringsecurity.dto.UsuarioRegistroDTO;
import com.registrousuariosspringsecurity.entities.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioService extends UserDetailsService {
    public Usuario saveUser(UsuarioRegistroDTO registroDTO);

}
