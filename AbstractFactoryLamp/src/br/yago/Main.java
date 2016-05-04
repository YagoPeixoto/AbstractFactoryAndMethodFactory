package br.yago;

public class Main {
	public static void main(String[] args) {

		LampadaFactory fabrica = LampadaFactory.obterFactory("Lampada Incandescente");		
		Lampada lampadaIncandescente = fabrica.gerarLampada();
		lampadaIncandescente.ligar();
	
		LampadaFactory gerar = LampadaFactory.obterFactory("Lampada Fluorescente");		
		Lampada lampadaFluorescente = gerar.gerarLampada();
		lampadaFluorescente.ligar();

		lampadaIncandescente.ligar();
		lampadaFluorescente.ligar();
		
		System.out.println();
	}
}
