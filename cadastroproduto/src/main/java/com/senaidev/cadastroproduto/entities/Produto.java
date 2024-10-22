package com.senaidev.cadastroproduto.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_produto")
public class Produto {

	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  
	  @Column(name = "nome")
	  private String nome;
	  
	  @Column(name = "preço")
	  private double preco;
	  
	  public Produto() {
		  
	  }
	  
	  public Produto(Long id, String nome, double preco) {
		  this.id = id;
		  this.nome = nome;
		  this.preco = preco;
	  }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	  
}
