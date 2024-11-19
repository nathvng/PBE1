package com.senai.mercado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.mercado.entities.Produto;
import com.senai.mercado.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository ProdutoRepository;
	
	public Produto saveProduto(Produto produto) {
		return ProdutoRepository.save(produto);
	}

	public List<Produto> getAllProduto(){
		return ProdutoRepository.findAll();
	}	
	
	public Produto getProdutoById1(Long Id) {
		return ProdutoRepository.findById(Id).orElse(null);
	}

	public void deleteProduto(Long id) {
		ProdutoRepository.deleteById(id);
	}

	public Produto getProdutoById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
