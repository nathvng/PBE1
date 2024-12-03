package com.senai.faculdadesesi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.faculdadesesi.entities.Cursos;
import com.senai.faculdadesesi.service.CursosService;

@RestController
@RequestMapping ("/Cursos")
public class CursosController {

	@Autowired
	private CursosService cursosService;

	@PostMapping
	public Cursos createCursos(@RequestBody Cursos cursos) {
		return cursosService.saveCursos(cursos);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cursos> getCursos(@PathVariable Long id) {
		Cursos cursos = cursosService.getCursosById(id);
		if (cursos != null) {
			return ResponseEntity.ok(cursos);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
