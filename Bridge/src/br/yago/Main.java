package br.yago;

public class Main {
    public static void main(String[] args) {
    GeradorLampadaLed lamp = new GeradorLampadaLed();
    Dados dados = new Dados("10 Watts", "GE", lamp);
        dados.geraLampada();
        
        
}
}