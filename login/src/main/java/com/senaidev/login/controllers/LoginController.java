package com.senaidev.login.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.login.entities.Usuario;
import com.senaidev.login.services.UsuarioService;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping
	public ResponseEntity<String> login(@RequestBody Usuario usuario) {
		boolean isValid = usuarioService.validarLogin(usuario);

		if (isValid) {
			return ResponseEntity.ok("Login bem sucedido");
		} else {
			return ResponseEntity.status(401).body("Credenciais inválidas");
		}
	}

}
