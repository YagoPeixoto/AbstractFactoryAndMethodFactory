package br.yago;

public class Main {

	public static void main(String[] args) {

		String eficiencia, tipo, watts;

		System.out.println("Lampada Fluorescente:");
		eficiencia = "A";
		tipo = "Fluorescente";
		watts = "20 watts";

		Lampada lamp = LampadaFactory.gerarLampada(eficiencia, tipo, watts);
		lamp.exibirDados();
		
		System.out.println("");
		System.out.println("");

		System.out.println("Lampada Incandescente:");
		eficiencia = "D";
		tipo = "Incandescente";
		watts = "100 watts";

		Lampada lamp2 = LampadaFactory.gerarLampada(eficiencia, tipo, watts);
		lamp2.exibirDados();
	}
}
