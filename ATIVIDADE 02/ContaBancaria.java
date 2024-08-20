package prjCarro;
import java.util.Scanner;
public class ContaBancaria {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o número da conta bancária? ");
		int numeroConta = sc.nextInt();
		
		System.out.println("Qual o nome do titular da conta bancária? ");
		String nomeTitular = sc.nextLine();
		
		System.out.println("Qual o saldo atual da conta? ");
		double saldo = sc.nextDouble();
		
		System.out.println("Qual o valor do deposito ao saldo da conta? ");
		double depositar = sc.nextDouble();
		
		System.out.println("Quanto você deseja sacar? ");
		double sacar = sc.nextDouble();
		
		
		if (saldo > sacar) {
			System.out.println("Seu saque está sendo processado! ");
		}
		else if (saldo < sacar) {
			System.out.println("Saldo inválido. Saque indisponível.");
		}
		else {
			System.out.println("Opção inválida");
		}
		 System.out.println("O número da sua conta: " + numeroConta);
	     System.out.println("Seu nome: " + nomeTitular);
	     System.out.println("Saldo inicial: " + saldo);
}

}
