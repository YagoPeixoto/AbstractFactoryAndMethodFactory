package br.yago;

public class Main {

	public static void main(String[] args) { 
	    LigarLampada ligar = new LigarLampada(); 
	         
	    
	    LampadaStrategy led = new LED(); 
	    double estadoLamp = ligar.ligarLampada(1, led); 
	    System.out.println("Lampada Led: " + estadoLamp); 

	  } 
	
}
