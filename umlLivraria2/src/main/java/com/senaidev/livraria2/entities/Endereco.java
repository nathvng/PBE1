package com.senaidev.livraria2.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "enderecos")

public class Endereco {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long idEndereco;

	@Column(nullable = false, length = 100)

	private String rua;

	@Column(nullable = false)

	private int nmCasa;

	@Column(nullable = false, length = 100)

	private String bairro;

	@Column(nullable = false, length = 100)

	private String cidade;

	@Column(nullable = false, length = 100)

	private String estado;

	
	public Endereco() {

	}

	public Endereco(Long idEndereco, String rua, int nmCasa, String bairro, String estado) {
		this.idEndereco = idEndereco;
		this.rua = rua;
		this.nmCasa = nmCasa;
		this.bairro = bairro;
		this.estado = estado;
	}

	public Long getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNmCasa() {
		return nmCasa;
	}

	public void setNmCasa(int nmCasa) {
		this.nmCasa = nmCasa;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}