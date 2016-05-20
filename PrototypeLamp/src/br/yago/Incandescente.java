package br.yago;

public class Incandescente extends Lampada {

	public Incandescente(String watsInc, String tipoInc) {
		super();
		this.wats = watsInc;
		this.tipo = tipoInc;
		setLampada(watsInc, tipoInc);

		desligar();
	}
	
	public void setLampada(String watsInc, String tipoInc) {

	}

}
