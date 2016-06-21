package br.yago;

public class Main {
	public static void main(String[] args) {

		Composite luta = new Composite();
		
		UFC ufc = new UFC();
		luta.addLuta(ufc);
		
		Bellator bellator = new Bellator();
		luta.addLuta(bellator);

		luta.imprimir();
	}
}
