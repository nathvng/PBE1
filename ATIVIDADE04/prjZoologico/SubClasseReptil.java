package prjZoologico;

public class SubClasseReptil extends ClasseAnimal {
	
		//Métodos da SubClasse
		public void metodoTrocarPele() {
			System.out.println(this.atributoNome + " está trocando de pele!");
		}
		@Override
		public void metodoEmitirSom() {
			System.out.println("flap");
		}
		
		public void metodoRastejar() {
			System.out.println(this.atributoNome + "está rastejando!");
		}
	}

