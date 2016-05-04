package br.yago;

public class Incandescente extends Lampada {

	protected Incandescente(String eficiencia, String tipo, String watts) {
		super(eficiencia, tipo, watts);
	}

	@Override
	public void exibirDados() {
		System.out.println(this.getEficiencia()+" , "+ this.getTipo()+" , "+this.getWatts());
	} 
	
}
