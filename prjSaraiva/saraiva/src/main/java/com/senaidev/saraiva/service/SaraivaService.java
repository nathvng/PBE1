package com.senaidev.saraiva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.saraiva.entities.Saraiva;
import com.senaidev.saraiva.repository.SaraivaRepository;

@Service
public class SaraivaService {

	@Autowired
	private SaraivaRepository saraivaRepository;

	public Saraiva saveSaraiva(Saraiva saraiva) {
		return saraivaRepository.save(saraiva);
	}

	public List<Saraiva> getAllSaraiva() {
		return saraivaRepository.findAll();
	}

	public Saraiva getSaraivaById(Long Id) {
		return saraivaRepository.findById(Id).orElse(null);
	}

	public void deleteSaraiva(Long id) {
		saraivaRepository.deleteById(id);
	}

}