package com.senaidev.livraria2.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "livros")
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduto;
	@Column(nullable = false, length = 100)
	private String nome;
	@Column(nullable = false, unique = true, length = 13)
	private String isbn;
	@Column(nullable = false, length = 100)
	private String categoria;
	@Column(nullable = false)
	private int estoque;
	@ManyToOne
	@JoinColumn(name = "id_autor", nullable = false)
	private Autor autor;
	@ManyToOne
	@JoinColumn(name = "id_editora", nullable = false)
	private Editora editora;

	public Livro() {

	}

	public Livro(String nome, String isbn, String categoria, int estoque, Autor autor, Editora editora) {
		this.nome = nome;
		this.isbn = isbn;
		this.categoria = categoria;
		this.estoque = estoque;
		this.autor = autor;
		this.editora = editora;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}
}
