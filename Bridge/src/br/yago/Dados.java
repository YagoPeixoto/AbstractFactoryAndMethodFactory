package br.yago;

public class Dados implements Lampada {
	private String watts;
	private String marca;

	private GeradorDeLampada geradorDeLampada;

	public Dados(String watts, String marca, GeradorDeLampada tipoDoLampada) {
		super();
		this.watts = watts;
		this.marca = marca;
		geradorDeLampada = tipoDoLampada;
	}

	@Override
	public void geraLampada() {
		StringBuilder dados = new StringBuilder();
		dados.append("Lampada LED: ");
		dados.append("\n");
		dados.append("Watts: " + this.watts);
		dados.append("\n");
		dados.append("Marca: " + this.marca);
		this.geradorDeLampada.criarLampada(dados.toString());
	}
}