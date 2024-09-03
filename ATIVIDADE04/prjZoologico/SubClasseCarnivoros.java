package prjZoologico;

public class SubClasseCarnivoros extends ClasseAnimal {

	//Métodos da SubClasse
	public void metodoCacar() {
		System.out.println(this.atributoNome + " está caçando!");
	}
	@Override
	public void metodoEmitirSom() {
		System.out.println("WHAAAAARRR");
	}
}
