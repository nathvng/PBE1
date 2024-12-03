package com.senai.faculdadesesi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.faculdadesesi.entities.Disciplinas;
import com.senai.faculdadesesi.service.DisciplinasService;

@RestController
@RequestMapping ("/Disciplinas")
public class DisciplinasController {

	@Autowired
	private DisciplinasService disciplinasService;

	@PostMapping
	public Disciplinas createDisciplinas(@RequestBody Disciplinas disciplinas) {
		return disciplinasService.saveDisciplinas(disciplinas);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Disciplinas> getDisciplinas(@PathVariable Long id) {
		Disciplinas disciplinas = disciplinasService.getDisciplinasById(id);
		if (disciplinas != null) {
			return ResponseEntity.ok(disciplinas);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}

