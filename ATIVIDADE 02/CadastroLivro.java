package prjCarro;
import java.util.Scanner;
public class CadastroLivro {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o título do livro? ");
        String titulo = sc.nextLine();
        
        System.out.print("Qual o nome do autor do livro? ");
        String autor = sc.nextLine();
        
        System.out.print("Qual a quantidade de páginas do livro? ");
        int numeroPaginas = sc.nextInt();
	}
	
        boolean disponivel;

        void sim () {
			disponivel = true;
			this.disponivel = true;
		}
		
		
		void nao () {
			disponivel = false;
			this.disponivel = false;
		}
        
		{
        System.out.print("Título: " + titulo);
        System.out.print (" \n Autor: " + autor);
        System.out.print (" \nQuantidade de páginas: " + numeroPaginas);
 	}
}


