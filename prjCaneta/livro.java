package prjCaneta;

public class livro {
	String nomeLivro;
	String nomeAutor;
	boolean alugado;
	public livro (String nome, String autor) {
		this.nomeLivro = nomeLivro;
		this.nomeAutor = nomeAutor;
		this.alugado = false;
	}
	
	void status() {
	System.out.println("1 " + this.nomeLivro + ":" + (this.alugado ? "Alugado":"Disponível"));
	
	}
	
	
	void alugar() {
		this.alugado = true;
	}
	
	
	void devolver() {
		this.alugado = false;
	}
}
