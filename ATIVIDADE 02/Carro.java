package prjCarro;

public class Carro {
//Atributos
	private String marca;
	private String modelo;
	private int velocidade;
	
	//Construtores 
	public Carro(){
		
	}
	public Carro(String marca, String modelo, int velocidade) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidade = velocidade;
	}
	public Carro(String marca){
		this.marca = marca;
	}
	
	//Getters Setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade (int velocidade) {
		if (velocidade < 0) {
			System.out.println("Velocidade não pode ser negativa!");
			this.velocidade = 0;
		}
		else {
		this.velocidade = velocidade;
		}
	}
	
	//Métodos
	void acelerar (int acelerar) {
		velocidade += acelerar;
	}
	void frear (int reduzir) {
		velocidade -= reduzir;
	}
	void buzinar() {
		System.out.println("bibi fonfon");
	}
}
