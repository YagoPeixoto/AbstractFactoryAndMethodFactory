package br.yago;

public class Fluorescente extends Lampada {

	protected Fluorescente(String eficiencia, String tipo, String watts) {
		super(eficiencia, tipo, watts);
	}

	@Override
	public void exibirDados() {
		System.out.println(this.getEficiencia() + " , " + this.getTipo() + " , " + this.getWatts());
	}

}
