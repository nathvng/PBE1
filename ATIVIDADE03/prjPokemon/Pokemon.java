package prjPokemon;

public class Pokemon {

	//Atributos
		String atributoNome;
		String atributoTipo;
		int atributoNivel;
		int atributoHP;
		
		//Construtores
		public Pokemon() {
		}
		
		public Pokemon(String parametroNome, String parametroTipo,int parametroNivel, int parametroHP) {
			this.atributoNome = parametroNome;
			this.atributoTipo = parametroTipo;
			this.atributoNivel = parametroNivel;
			this.atributoHP = parametroHP;
		}
		
		//Métodos
		public void metodoEvolucao() {
			if (this.atributoNivel >= 2) {
				System.out.println(this.atributoNome + " ,você evoluiu!!!");
			}
			else {
					this.atributoNivel += 2;			
					this.atributoNivel += 2;
			 }
			 }
			 public void metodoAtacar() {
				 if (this.atributoHP <= 20) {
					 System.out.println(this.atributoNome + ", perdeu -20 de vida");
					 }
				 else {
					 this.atributoHP -= 20;
				}
			 }
			 public void exibirInfo() {
				 System.out.println("Nome " + this.atributoNome);
				 System.out.println("HP " + this.atributoHP);
				 }
			 }