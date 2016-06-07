package br.yago;

public class LED implements LampadaStrategy { 

	@Override
	public double ligaLamp(double estado) {
		System.out.println("Lampada Led, 10Wats");		
		return estado;
	} 
	}