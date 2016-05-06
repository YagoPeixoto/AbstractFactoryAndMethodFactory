package br.yago;

public abstract class Lampada {

	protected String nome;

	public void imprimirNome() {
		System.out.println(nome);
	}

	public abstract void ligar();
}
