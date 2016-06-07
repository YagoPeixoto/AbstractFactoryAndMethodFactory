package br.yago;
import br.yago.LampadaStrategy;

public class LigarLampada { 
	  public double ligarLampada(double estado,  LampadaStrategy watts) {
	      return watts.ligaLamp(estado); 
	  } 
	}
