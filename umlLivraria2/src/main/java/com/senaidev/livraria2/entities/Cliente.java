package com.senaidev.livraria2.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
	@Table(name = "clientes") 
	public class Cliente { 
		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
		private Long id_cliente; 
		
		@Column(nullable = false, length = 100) 
		private String nome;
		
		@Column(nullable = false, unique = true, length = 11) 
		private String cpf;
		
		@Column(nullable = false, unique = true, length = 9) 
		private String rg;
		
		@Column(nullable = false, unique = true, length = 100) 
		private String email; 
		
		@Column(unique = true, length = 13) 
		private String telefone;
		
		//Construtores
		public Cliente() {

		}

		public Cliente(Long id, String nome, String cpf, String rg,  String email, String telefone) {
			this.id_cliente = id;
			this.nome = nome;
			this.cpf = cpf;
			this.rg = rg;
			this.email = email;
			this.telefone = telefone;
		}

		public Long getId_cliente() {
			return id_cliente;
		}

		public void setId_cliente(Long id_cliente) {
			this.id_cliente = id_cliente;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getRg() {
			return rg;
		}

		public void setRg(String rg) {
			this.rg = rg;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		
	}
