package com.senai.mercado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.mercado.entities.Categoria;
import com.senai.mercado.repository.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository CategoriaRepository;
	
	public Categoria saveProduto(Categoria categoria) {
		return CategoriaRepository.save(categoria);
	}

	public List<Categoria> getAllCategoria(){
		return CategoriaRepository.findAll();
	}	
	
	public Categoria getProdutoById1(Long Id) {
		return CategoriaRepository.findById(Id).orElse(null);
	}

	public void deleteCategoria(Long id) {
		CategoriaRepository.deleteById(id);
	}

	public Categoria getCategoriaById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Categoria saveCategoria(Categoria categoria) {
		// TODO Auto-generated method stub
		return null;
	}
}