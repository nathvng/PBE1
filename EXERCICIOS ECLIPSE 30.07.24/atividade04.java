package programacao_backend;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		int valor1 = 4;
		int valor2 = 7;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual é o código da peça 1? ");
        int cod = sc.nextInt();
        
        System.out.print("Qual é a quantidade de peça que você quer? ");
        int qtd = sc.nextInt();
        
        System.out.print("A peça 1 é 4 reais a unidade.");
        
        System.out.println("Qual é o código da peça 2? ");
        int cod2 = sc.nextInt();
        
        System.out.print("Qual é a quantidade de peça que você quer? ");
        int qtd2 = sc.nextInt();
        
        System.out.println("A peça 2 é 7 reais a unidade.");
        
        System.out.println("Você pagará " + (valor1 * qtd) + " reais na peça 1.");
        
        System.out.println("Você pagará " + (valor2 * qtd2) + " reais na peça 2.");
        System.out.println("Total: " + (valor2 * qtd2 + v * qtd));
        
        
        sc.close();
        
        
        
	}

}
