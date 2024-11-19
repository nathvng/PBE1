package com.senaidev.cadastrocliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.cadastrocliente.entities.Telefone;
import com.senaidev.cadastrocliente.repository.TelefoneRepository;

@Service
public class TelefoneService {
	@Autowired
	private TelefoneRepository telefoneRepository;
	
	public Telefone saveTelefone(Telefone telefone) {
		return telefoneRepository.save(telefone);
	}

	public List<Telefone> getAllTelefone(){
		return telefoneRepository.findAll();
	}	
	
	public Telefone getTelefoneById(Long Id) {
		return telefoneRepository.findById(Id).orElse(null);
	}

	public void deleteTelefone(Long id) {
		telefoneRepository.deleteById(id);
	
	}
}