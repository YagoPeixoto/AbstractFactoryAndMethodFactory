package br.yago;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class GeradorLampadaLed implements GeradorDeLampada {
	@Override
	public void criarLampada(String dados) {
		try {
			PrintStream lampada = new PrintStream("lampada");
			lampada.println(dados);
			lampada.close();
			System.out.println("Lampada gerada com sucesso");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}