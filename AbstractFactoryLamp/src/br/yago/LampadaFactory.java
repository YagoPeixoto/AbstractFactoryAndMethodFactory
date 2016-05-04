package br.yago;

public abstract class LampadaFactory {

public static LampadaFactory obterFactory(String tipo){
		
		switch (tipo) {
		case "Lampada Incandescente":	
			return new LampadaIncandescenteFactory();
		case "Lampada Fluorescente":
			return new LampadaFluorescenteFactory();
			
		default:
			return null;
		}
		
	}
	
	public abstract Lampada gerarLampada();
	
}
