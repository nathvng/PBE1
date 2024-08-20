package prjCarro;

import java.util.Scanner;

public class andarDeCarro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Qual a marca do seu carro? ");
        String marca = sc.nextLine();
        
        System.out.print("Qual o modelo do seu carro? ");
        String modelo = sc.nextLine();
        
        System.out.print("Qual a velocidade que você normalmente anda no seu carro?(em Km/h) ");
        int velocidade = sc.nextInt();
        
        System.out.print("Você quer acelerar ou diminuir a velocidade atual?\n" + "Para acelerar digite 1 - Para diminuir digite 2: ");
        int veloc = sc.nextInt();
        
        if  (veloc == 1){
        	System.out.print("Quantos Km que gostaria de acelerar?");
            int veloac = sc.nextInt();
           int velot = veloac + velocidade;
           System.out.print("Você vai pra " + velot + " Km/h");
		}
        else if (veloc == 2) {
        	System.out.print("Quantos Km que gostaria de diminuir?");
            int velod = sc.nextInt();
            int veloto = velocidade - velod;
            System.out.print("Você vai pra " + veloto + " km/h");
		}
        
		else {
			System.out.print("Resposta inválida");
		}
        
        System.out.print("\nO seu carro é da marca: " + marca);
        System.out.print("\nDo modelo: " + modelo);

        
	}

}
