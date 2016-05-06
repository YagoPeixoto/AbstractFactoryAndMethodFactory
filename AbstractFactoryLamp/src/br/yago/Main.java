package br.yago;

public class Main {
	public static void main(String[] args) {

		LampadaFactory fabrica = LampadaFactory.obterFactory("LampadaIncandescente");		
		Lampada lampadaIncandescente = fabrica.gerarLampada();
		lampadaIncandescente.ligar();
		
		System.out.println();
		System.out.println();
	
		LampadaFactory gerar = LampadaFactory.obterFactory("LampadaFluorescente");		
		Lampada lampadaFluorescente = gerar.gerarLampada();
		lampadaFluorescente.ligar();

		System.out.println();
		System.out.println();
		
		LampadaFactory produzir = LampadaFactory.obterFactory("LampadaDeLED");		
		Lampada lampadaLED = produzir.gerarLampada();
		lampadaLED.ligar();
		
		
		System.out.println();
	}
}
