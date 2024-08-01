package programacao_backend;

import java.util.Scanner;

public class atividade01 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite um número: ");
		int num1 = sc.nextInt();
		
		System.out.print("Digite outro número: ");
		int num2 = sc.nextInt();
		
		System.out.println("A soma desses números é: " + (num1 + num2));
		
		sc.close();
		
	}

}
