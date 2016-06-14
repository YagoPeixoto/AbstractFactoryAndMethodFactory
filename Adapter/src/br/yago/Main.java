package br.yago;

public class Main {

	public static void main(String args[]) {
		Volts220 v220 = new Volts220();

		Adapter adapter = new Adapter(v220);
		adapter.volts_110();
	}
}
