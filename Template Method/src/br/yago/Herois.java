package br.yago;

public abstract class Herois {
	public final void templateMethod() {
		System.out.println("MARVEL E DC");

		herois();

	}

	public abstract void herois();
}