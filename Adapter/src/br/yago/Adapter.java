package br.yago;

public class Adapter extends Volts110{
	private Volts220 volts220;

	public Adapter(Volts220 volts220) {
		this.volts220 = volts220;
	}

	public void volts_110() {
		volts220.volts_220();
	}
}
