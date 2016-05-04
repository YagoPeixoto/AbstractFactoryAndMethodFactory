package br.yago;

public class LampadaIncandescenteFactory extends LampadaFactory{

	@Override
	public Lampada gerarLampada() {
		return new LampadaIncandescente();
	}

	
}
