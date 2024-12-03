package com.senai.faculdadesesi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.faculdadesesi.entities.Cursos;
import com.senai.faculdadesesi.repository.CursosRepository;

@Service
public class CursosService {

	@Autowired
	private CursosRepository cursosRepository;
	
	public Cursos saveCursos(Cursos cursos) {
		return cursosRepository.save(cursos);
	}

	
	
	public Cursos getCursosById(Long Id) {
		return cursosRepository.findById(Id).orElse(null);
	}

}


