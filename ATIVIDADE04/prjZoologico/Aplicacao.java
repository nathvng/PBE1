package prjZoologico;

public class Aplicacao {

	public static void main(String[] args) {
		ClasseAnimal elefante = new ClasseAnimal();
		elefante.setNome("Dumbo");
		elefante.setPeso(-100);
		

		ClasseAnimal girafa = new ClasseAnimal ("BruBru", "Russa", "Fêmea", 50);

		SubClasseCarnivoros leao = new SubClasseCarnivoros();
		leao.atributoNome = "GuiGui";
		leao.atributoRaca = "Australiano ";
		leao.atributoSexo = "Macho";
		leao.atributoPeso = 130;
		
		SubClasseReptil camaleao = new SubClasseReptil();
		camaleao.atributoNome = "Pascal";
		camaleao.atributoRaca = "Calyptratus ";
		camaleao.atributoSexo = "Macho";
		camaleao.atributoPeso = 0.50;
		
		elefante.exibirInfo();
		
		elefante.metodoComer();
	
		elefante.exibirInfo();
		
		girafa.exibirInfo();
		
		elefante.metodoEmitirSom();
		girafa.metodoEmitirSom();
		leao.metodoEmitirSom();
		
	}

}
