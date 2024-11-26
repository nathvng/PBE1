package com.senaidev.livraria2.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
	@Table(name = "editoras")
	public class Editora {
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idEditora; 
		
		@Column(nullable = false, length = 100)
		private String nome;
		
		@Column(nullable = false, unique = true, length = 14)
		private String cnpj; 
		
		@Column(nullable = false, length = 100)
		private String nomeContato; 
		
		@Column(nullable = false, length = 13) 
		private String telefoneContato;
		
		@Column(nullable = false, length = 100)
		private String email; 
		
		@OneToMany(mappedBy = "editora") 
		private List<Livro> livros;
		public Editora() {
			
		}
		public Editora(String nome, String cnpj, String nomeContato, String telefoneContato, String email) {
			this.nome = nome;
			this.cnpj = cnpj;
			this.nomeContato = nomeContato;
			this.telefoneContato = telefoneContato;
			this.email = email; 
			}
		public Long getIdEditora() {
			return idEditora;
		}
		public void setIdEditora(Long idEditora) {
			this.idEditora = idEditora;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCnpj() {
			return cnpj;
		}
		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}
		public String getNomeContato() {
			return nomeContato;
		}
		public void setNomeContato(String nomeContato) {
			this.nomeContato = nomeContato;
		}
		public String getTelefoneContato() {
			return telefoneContato;
		}
		public void setTelefoneContato(String telefoneContato) {
			this.telefoneContato = telefoneContato;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public List<Livro> getLivros() {
			return livros;
		}
		public void setLivros(List<Livro> livros) {
			this.livros = livros;
		}

}
