package br.yago;

public class LampadaLEDFactory extends LampadaFactory {

	@Override
	public Lampada gerarLampada() {
		return new LampadaLED();

	}

}
