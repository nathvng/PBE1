package com.senaidev.cadastroproduto.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senaidev.cadastroproduto.entities.Produto;
import com.senaidev.cadastroproduto.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	private ProdutoRepository produtoRepository;
	
	public Produto saveProduto(Produto produto) {
		return produtoRepository.save(produto);   
	}
	public List<Produto> getAllProdutos(){
		return produtoRepository.findAll();
	}
}
