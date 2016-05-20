package br.yago;

public class Main {

	public static void main(String[] args) {

		PrototypeFactory prototypeLed = new PrototypeFactory(new LedLamp("10 wats", "LED"));
		Lampada lampadaLed = prototypeLed.gerarClone();
		System.out.println("Dados Lampada:" + lampadaLed.getWats() +", "+ lampadaLed.getTipo());
		
		System.out.println(""
				+ ""
				+ "");
		
		PrototypeFactory prototypeFlu = new PrototypeFactory(new Fluorescente("20 wats", "Fluorecente"));
		Lampada lampadaFlu = prototypeFlu.gerarClone();
		System.out.println("Dados Lampada:" + lampadaFlu.getWats() +", "+ lampadaFlu.getTipo());
		
		System.out.println(""
				+ ""
				+ "");
		
		
		PrototypeFactory prototypeInca = new PrototypeFactory(new Incandescente("100 wats", "Incandecente"));
		Lampada lampadaInca = prototypeInca.gerarClone();
		System.out.println("Dados Lampada:" + lampadaInca.getWats() +", "+ lampadaInca.getTipo());
		
	}

}
