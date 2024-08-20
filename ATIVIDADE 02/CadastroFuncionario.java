package prjCarro;

import java.util.Scanner;

public class CadastroFuncionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o seu nome completo? ");
        String nome = sc.nextLine();
        
        System.out.print("Qual seu salário bruto? ");
        double salarioBruto = sc.nextDouble();
        
        System.out.print("Qual a porcentagem de imposto aplicada sobre o salário bruto? ");
        double imposto = sc.nextDouble();
        
        double calcularSalarioLiquido = salarioBruto - salarioBruto * imposto / 100;
        
        System.out.print("Nome: " + nome);
        System.out.print (" \nSalário bruto: " + salarioBruto);
        System.out.print (" \nPorcentagem do imposto: " + imposto + " %");
        System.out.print (" \nSalário líquido: " + calcularSalarioLiquido + " reais.");
	}

}
