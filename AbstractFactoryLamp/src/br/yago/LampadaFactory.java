package br.yago;

public abstract class LampadaFactory {

	public static LampadaFactory obterFactory(String tipo) {

		switch (tipo) {
		case "LampadaIncandescente":
			return new LampadaIncandescenteFactory();
		case "LampadaFluorescente":
			return new LampadaFluorescenteFactory();
		case "LampadaDeLED":
			return new LampadaLEDFactory();

		default:
			return null;
		}

	}

	public abstract Lampada gerarLampada();

}
