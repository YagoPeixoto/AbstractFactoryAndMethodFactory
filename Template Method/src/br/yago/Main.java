package br.yago;

public class Main {

	public static void main(String[] args) {

		Marvel marvel = new Marvel();
		DC dc = new DC();

		marvel.templateMethod();
		dc.templateMethod();
		
		System.out.println();
		System.out.println("NÃO CHORE A MARVEL É MELHOR MESMO... SEM MIMIMI");
		System.out.println("BBIIIIIIIIRRRRRRRRRR");

	}
}