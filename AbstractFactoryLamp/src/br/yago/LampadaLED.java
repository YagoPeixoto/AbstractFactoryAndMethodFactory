package br.yago;

public class LampadaLED extends Lampada {

	public LampadaLED() {
		this.nome = "Lampada de LED";
	}

	@Override
	public void ligar() {

		System.out.println("Lampada de LED OK");

	}

}
