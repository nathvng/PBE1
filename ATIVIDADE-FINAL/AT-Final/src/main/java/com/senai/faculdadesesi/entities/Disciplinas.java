package com.senai.faculdadesesi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_disciplinas")
public class Disciplinas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_disciplinas;

	@Column(name = "nome")
	private String nome;

	@Column(name = "descrição")
	private String descricao;
	
	@Column(name = "carga horária")
	private double carga_horaria;

	@ManyToOne
	@JoinColumn(name = "CURSOS_id_cursos")
	private Cursos cursos;
	
	public Disciplinas(Long id_disciplinas, String nome, String descricao, double carga_horaria) {
		this.id_disciplinas = id_disciplinas;
		this.nome = nome;
		this.descricao = descricao;
		this.carga_horaria = carga_horaria;
	}
	
	public Disciplinas() {

	}

	public Long getId_disciplinas() {
		return id_disciplinas;
	}

	public void setId_disciplinas(Long id_disciplinas) {
		this.id_disciplinas = id_disciplinas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public Cursos getCursos() {
		return cursos;
	}

	public void setCursos(Cursos cursos) {
		this.cursos = cursos;
	}
}