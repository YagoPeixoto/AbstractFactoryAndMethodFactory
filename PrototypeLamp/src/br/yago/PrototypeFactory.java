package br.yago;

public class PrototypeFactory {

	Lampada prototypeLampada;

	public PrototypeFactory(Lampada lampada) {
		prototypeLampada = lampada;

	}

	public Lampada gerarClone() {
		return (Lampada) prototypeLampada.clone();
	}

}
