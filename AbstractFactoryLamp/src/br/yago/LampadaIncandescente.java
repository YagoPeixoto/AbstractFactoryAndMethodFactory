package br.yago;

public class LampadaIncandescente extends Lampada{

	public LampadaIncandescente(){
		this.nome = "Lampada Incandescente";
	}

	@Override
	public void ligar() {

		System.out.println("Lampada Incandescente Iniciada");
	
	}
}
