package br.yago;

public class LampadaFluorescenteFactory extends LampadaFactory{

	@Override
	public Lampada gerarLampada() {
		return new LampadaFluorescente();
	}

	
}
