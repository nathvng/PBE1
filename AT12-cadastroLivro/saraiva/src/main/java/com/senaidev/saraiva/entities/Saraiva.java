package com.senaidev.saraiva.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_livro")
	public class Saraiva {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		public Long id_livros;
		public String descricao;
		public String isbn;
		
		public Saraiva() {
			
		}
		
		public Saraiva(Long id_livros, String descricao, String isbn) {
			this.id_livros = id_livros;
			this.descricao = descricao;
			this.isbn = isbn;
		}

		public Long getId_livros() {
			return id_livros;
		}

		public void setId_livros(Long id_livros) {
			this.id_livros = id_livros;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public String getIsbn() {
			return isbn;
		}

		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
}
