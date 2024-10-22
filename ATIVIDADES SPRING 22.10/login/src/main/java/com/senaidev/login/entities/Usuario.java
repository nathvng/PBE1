package com.senaidev.login.entities;

public class Usuario {
    //Atributos
	private String username;
	private String password;
	
	//Construtores
	public Usuario() {
		
	}
	
	public Usuario(String username, String password) {
		this.username = username;
		this.password = password;
	}

	//Getters e setters
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	
}
}
