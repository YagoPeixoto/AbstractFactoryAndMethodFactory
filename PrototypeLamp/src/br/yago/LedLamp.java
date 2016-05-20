package br.yago;

public class LedLamp extends Lampada {

	public LedLamp(String watsLed, String tipoLed) {
		super();
		this.wats = watsLed;
		this.tipo = tipoLed;
		setLampada(watsLed, tipoLed);

		ligar();
	}

	public void setLampada(String watsLed, String tipoLed) {

	}

}
