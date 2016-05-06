package br.yago;

public abstract class Lampada {
	private String eficiencia;
	private String tipo;
	private String watts;
	private String marca;

	public Lampada(String eficiencia, String tipo, String watts, String marca) {

		this.eficiencia = eficiencia;
		this.tipo = tipo;
		this.watts = watts;
		this.marca = marca;
	}

	public String getEficiencia() {
		return eficiencia;
	}

	public String getTipo() {
		return tipo;
	}

	public String getWatts() {
		return watts;
	}

	public String getMarca() {
		return marca;
	}

	public abstract void exibirDados();

}
