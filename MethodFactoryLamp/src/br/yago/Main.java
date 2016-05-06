package br.yago;

public class Main {

	public static void main(String[] args) {

		String eficiencia, tipo, watts, marca;

		System.out.println("Lampada Fluorescente:");
		eficiencia = "A";
		tipo = "Fluorescente";
		watts = "20 watts";
		marca = "philips";

		Lampada lamp = LampadaFactory.gerarLampada(eficiencia, tipo, watts, marca);
		lamp.exibirDados();

		System.out.println("");
		System.out.println("");

		System.out.println("Lampada Incandescente:");
		eficiencia = "D";
		tipo = "Incandescente";
		watts = "100 watts";
		marca = "Osram";

		Lampada lamp2 = LampadaFactory.gerarLampada(eficiencia, tipo, watts, marca);
		lamp2.exibirDados();

		System.out.println("");
		System.out.println("");

		System.out.println("Lampada de LED:");
		eficiencia = "A";
		tipo = "LED";
		watts = "10 watts";
		marca = "GE";

		Lampada lamp3 = LampadaFactory.gerarLampada(eficiencia, tipo, watts, marca);
		lamp3.exibirDados();
	}
}
