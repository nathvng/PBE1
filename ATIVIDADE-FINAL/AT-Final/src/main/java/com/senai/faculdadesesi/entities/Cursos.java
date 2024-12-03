package com.senai.faculdadesesi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cursos")
public class Cursos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cursos;

	@Column(name = "nome título")
	private String nome_titulo;

	@Column(name = "descrição")
	private String descricao;
	
	@Column(name = "carga horária")
	private double carga_horaria;
	
	@Column(name = "nivel_dificuldade")
	private String nivel_dificuldade;

	public Cursos(Long id_cursos, String nome_titulo, String descricao, double carga_horaria, String nivel_dificuldade) {
		this.id_cursos = id_cursos;
		this.nome_titulo = nome_titulo;
		this.descricao = descricao;
		this.carga_horaria = carga_horaria;
		this.nivel_dificuldade = nivel_dificuldade;
	}

	public Cursos() {

	}

	public Long getId_cursos() {
		return id_cursos;
	}

	public void setId_cursos(Long id_cursos) {
		this.id_cursos = id_cursos;
	}

	public String getNome_titulo() {
		return nome_titulo;
	}

	public void setNome_titulo(String nome_titulo) {
		this.nome_titulo = nome_titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getCarga_horaria() {
		return carga_horaria;
	}

	public void setCarga_horaria(double carga_horaria) {
		this.carga_horaria = carga_horaria;
	}

	public String getNivel_dificuldade() {
		return nivel_dificuldade;
	}

	public void setNivel_dificuldade(String nivel_dificuldade) {
		this.nivel_dificuldade = nivel_dificuldade;
	}

}