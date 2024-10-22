package com.senaidev.cadastroproduto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.cadastroproduto.entities.Produto;
import com.senaidev.cadastroproduto.services.ProdutoService;

@RestController
@RequestMapping ("/Produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	public Produto createProduto(@RequestBody Produto produto) {
		return produtoService.saveProduto(produto);
	}

	@GetMapping
	public List<Produto> getAllProdutos(){
	return produtoService.getAllProdutos();	   
	}
}
