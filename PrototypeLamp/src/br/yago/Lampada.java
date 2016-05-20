package br.yago;

public abstract class Lampada implements Cloneable {

	String wats;
	String tipo;

	public Lampada() {
		// TODO Auto-generated constructor stub
	}

	public void setLampada(String wats, String tipo) {
		this.wats = wats;
		this.tipo = tipo;
	}
	

	public String getWats() {
		return wats;
	}

	public String getTipo() {
		return tipo;
	}

	public void ligar() {

		System.out.println(wats);
		System.out.println(tipo);
		System.out.println("Esta ligada");

	}

	public void desligar() {

		System.out.println(wats);
		System.out.println(tipo);
		System.out.println("Vish essa gasta demais, e esta desligada!!!");

	}

	@Override
	public Lampada clone() {
		Lampada lampada = null;
		try {
			lampada = (Lampada) super.clone();
		} catch (CloneNotSupportedException exception) {
			System.out.println("Erro em clonar a lampada");
		}
		return lampada;
	}
}
