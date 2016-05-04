package br.yago;

public class LampadaFactory {

	public static Lampada gerarLampada(String eficiencia, String tipo, String watts) {

		switch (tipo) {
		case "Fluorescente":
			return new Fluorescente(eficiencia, tipo, watts);
		case "Incandescente":
			return new Incandescente(eficiencia, tipo, watts);

		default:
			return null;
		}

	}
}
