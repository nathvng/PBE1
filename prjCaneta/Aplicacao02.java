package prjCaneta;

import java.util.Scanner;

public class Aplicacao02 {
	public static void main (String [] args) {
		livro livro01 = new livro("Alice no País", "Júlio Trigueiro");
		livro livro02 = new livro("Quarto de despejo", "Pedro Francisco");

		System.out.println("Livros disponíveis");
		System.out.print("01. ");
		livro01.status();
		System.out.print("02. ");
		livro02.status();
		
		System.out.println("Qual livro deseja alugar?");
		int escolha = sc.nextInt();

}
}
