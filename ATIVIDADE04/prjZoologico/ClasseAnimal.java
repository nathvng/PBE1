package prjZoologico;

public class ClasseAnimal {

	//Atributos
	private String atributoNome;
	private String atributoRaca;
	private String atributoSexo;
	private double atributoPeso;
	
	//Construtores
	public ClasseAnimal() {
	}
	
	public ClasseAnimal(String parametroNome, String parametroRaca,String parametroSexo, double parametroPeso) {
		this.atributoNome = parametroNome;
		this.atributoRaca = parametroRaca;
		this.atributoSexo = parametroSexo;
		this.atributoPeso = parametroPeso;
	}
	//Métodos Setters
	public void setNome(String parametroNome) {
		this.atributoNome = parametroNome;
		
	}
	public void setPeso(double parametroPeso) {
		if (parametroPeso > 0) {
		this.atributoPeso = parametroPeso;
		}
		else {
			this.atributoPeso = 10;
		}
	}

	//Métodos
	public void metodoComer() {
		if (this.atributoPeso >= 170) {
			System.out.println(this.atributoNome + "Está obeso, vamos nos exercitar");
		}
		else {
		this.atributoPeso += 10;
}
}
	public void metodoComer(int parametroRacao) {
		if (this.atributoPeso >= 170) {
			System.out.println(this.atributoNome + "Está obeso, vamos nos exercitar");
		}
		else {
		this.atributoPeso += parametroRacao;
}
}
	public void metodoExercitar() {
		if(this.atributoPeso <= 50) {
			System.out.println(this.atributoNome + "Está magro demais, se alimente!!");
		}
		else {
		this.atributoPeso -= 10;
	}
}
	public void exibirInfo() {
		System.out.println("Nome: " + this.atributoNome);
		System.out.println("Peso: " + this.atributoPeso);
		
	}
	public void metodoEmitirSom() {
		System.out.println("Barulho do bichinho");
	}

	public String getAtributoNome() {
		return atributoNome;
	}

	public void setAtributoNome(String atributoNome) {
		this.atributoNome = atributoNome;
	}

	public String getAtributoRaca() {
		return atributoRaca;
	}

	public void setAtributoRaca(String atributoRaca) {
		this.atributoRaca = atributoRaca;
	}

	public String getAtributoSexo() {
		return atributoSexo;
	}

	public void setAtributoSexo(String atributoSexo) {
		this.atributoSexo = atributoSexo;
	}

	public double getAtributoPeso() {
		return atributoPeso;
	}

	public void setAtributoPeso(double atributoPeso) {
		this.atributoPeso = atributoPeso;
	}
	}