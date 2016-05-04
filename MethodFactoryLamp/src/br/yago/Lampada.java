package br.yago;

public abstract class Lampada {
	private String eficiencia;
	private String tipo;
	private String watts;

	public Lampada(String eficiencia, String tipo, String watts) {

		this.eficiencia = eficiencia;
		this.tipo = tipo;
		this.watts = watts;
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

	public abstract void exibirDados();

}
