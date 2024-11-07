package com.senaidev.saraiva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.saraiva.entities.Saraiva;
import com.senaidev.saraiva.service.SaraivaService;

@RestController
@RequestMapping ("/livros")
public class SaraivaController {

	@Autowired
	private SaraivaService saraivaService;

	@PostMapping
	public Saraiva createSaraiva(@RequestBody Saraiva saraiva) {
		return saraivaService.saveSaraiva(saraiva);
	}

	@GetMapping
	public List<Saraiva> getAllSaraiva(){
	return saraivaService.getAllSaraiva();	   
	}
	
	@GetMapping("/{id}")
	public Saraiva getSaraiva(@PathVariable Long id) {
		return saraivaService.getSaraivaById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteSaraiva (@PathVariable Long id) {
		saraivaService.deleteSaraiva(id);
	}
}