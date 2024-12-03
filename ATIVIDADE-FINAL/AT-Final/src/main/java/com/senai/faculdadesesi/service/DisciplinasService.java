package com.senai.faculdadesesi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.faculdadesesi.entities.Disciplinas;
import com.senai.faculdadesesi.repository.DisciplinasRepository;

@Service
public class DisciplinasService {

	@Autowired
	private DisciplinasRepository disciplinasRepository;
	
	public Disciplinas saveDisciplinas(Disciplinas disciplinas) {
		return disciplinasRepository.save(disciplinas);
	}

	public Disciplinas getDisciplinasById(Long Id) {
		return disciplinasRepository.findById(Id).orElse(null);
	}

}

