package prjCaneta;

public class caneta {

		String modelo;
		String cor;
		String ponta;
		int carga;
		boolean tampada;
		
		void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Carga: " + this.carga);
		
		}
		
		void rabiscar() {
		}
		
		void tampar() {
			tampada = true;
			this.tampada = true;
		}
		
		
		void destampar() {
			tampada = false;
			this.tampada = false;
		}
}