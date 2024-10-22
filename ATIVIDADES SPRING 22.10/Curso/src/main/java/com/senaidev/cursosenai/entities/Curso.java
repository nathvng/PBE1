package com.senaidev.cursosenai.entities;

@Entity
public class Curso {
	        //Atributos
	        @Id
			private String nome_curso;
			private String descricao;
			private int id_curso;
			private int carga;
			private int ano;
			
			//Construtores
			public Curso() {
				
			}
			
			public Curso(String nome_curso, String descricao, int id_curso, int carga, int ano) {
				this.nome_curso = nome_curso;
				this.descricao = descricao;
				this.id_curso = id_curso;
				this.carga = carga;
				this.ano = ano;
			}
			
			//Getters e setters
			public String getNome_curso() {
				return nome_curso;
			}
			
			public void setNome_curso(String nome_curso) {
				this.nome_curso = nome_curso;
			}
			
			public String getDescricao() {
				return descricao;
			}
			
			public void setDescricao(String descricao) {
				this.descricao = descricao;
			
		    }
			
			public int getId_curso() {
				return id_curso;
			}
			
			public void setId_curso(int id_curso) {
				this.id_curso = id_curso;
			}
			
			public int getCarga() {
				return carga;
			}
			
			public void setCarga(int carga) {
				this.carga = carga;
			}
			
			public int getAno() {
				return ano;
			}
			
			public void setAno(int ano) {
				this.ano = ano;
			}
	}

