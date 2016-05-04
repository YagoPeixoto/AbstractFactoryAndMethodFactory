package br.yago;

public class LampadaFluorescente extends Lampada{

	public LampadaFluorescente(){
		this.nome = "Lampada Fluorescente";
	}
	
	@Override
	public void ligar() {
		
		System.out.println("Lampada Fluorescente Iniciada");

	}
}
