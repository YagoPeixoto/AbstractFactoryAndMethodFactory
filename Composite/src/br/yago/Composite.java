package br.yago;

import java.util.ArrayList;

class Composite implements Lutas {

	private ArrayList<Lutas> listaLutas = new ArrayList<Lutas>();

	public void imprimir() {
		for (Lutas luta : listaLutas) {
			luta.imprimir();
		}
	}

	public void addLuta(Lutas luta) {
		listaLutas.add(luta);
	}

}