package br.yago;

public class LampadaFactory {

	public static Lampada gerarLampada(String eficiencia, String tipo, String watts, String marca) {

		switch (tipo) {
		case "Fluorescente":
			return new Fluorescente(eficiencia, tipo, watts, marca);
		case "Incandescente":
			return new Incandescente(eficiencia, tipo, watts, marca);
		case "LED":
			return new LED(eficiencia, tipo, watts, marca);

		default:
			return null;
		}

	}
}
