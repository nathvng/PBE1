package prjPokemon;

import Pokemon;

public class Aplicacao {

	public static void main(String[] args) {
		Pokemon charizard = new Pokemon();
		charizard.atributoNome = "Charizard"; 
		charizard.atributoTipo = "Fogo";
		charizard.atributoNivel = 1;
		charizard.atributoHP =  78 ; 

		Pokemon charmander = new Pokemon ("Charmander", "Fogo", 2, 70);
		Pokemon munna = new Pokemon ("Munna", "Místico", 1, 70);
		Pokemon scraggy = new Pokemon ("Scraggy", "Sombrio e Lutador", 2, 60);
		Pokemon pikachu = new Pokemon ("Pikachu", "Elétrico", 2, 70);
		
		charizard.exibirInfo();
		
		charizard.metodoAtacar();
	
		charizard.exibirInfo();
		
	}
	}