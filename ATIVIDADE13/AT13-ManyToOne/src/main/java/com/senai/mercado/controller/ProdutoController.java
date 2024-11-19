package com.senai.mercado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.mercado.entities.Produto;
import com.senai.mercado.service.ProdutoService;

@RestController
@RequestMapping ("/Produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@PostMapping
	public Produto createProduto(@RequestBody Produto produto) {
		return produtoService.saveProduto(produto);
	}

	@GetMapping
	public List<Produto> getAllProduto(){
	return produtoService.getAllProduto();	   
	}
	
	@GetMapping("/{id}")
	public Produto getProduto(@PathVariable Long id) {
		return produtoService.getProdutoById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteProduto (@PathVariable Long id) {
		produtoService.deleteProduto(id);
	}
}

