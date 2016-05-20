package br.yago;

public class Fluorescente extends Lampada {

	public Fluorescente(String watsFlu, String tipoFlu) {
		super();
		this.wats = watsFlu;
		this.tipo = tipoFlu;
		setLampada(watsFlu, tipoFlu);

		ligar();
	}

	public void setLampada(String watsFlu, String tipoFlu) {

	}

}
