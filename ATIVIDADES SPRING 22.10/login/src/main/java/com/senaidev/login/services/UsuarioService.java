package com.senaidev.login.services;

import org.springframework.stereotype.Service;

import com.senaidev.login.entities.Usuario;
@Service
public class UsuarioService {

	public boolean validarLogin(Usuario usuario) {
		return "admin".equals(usuario.getUsername()) && "1234".equals(usuario.getPassword());
	}
}
