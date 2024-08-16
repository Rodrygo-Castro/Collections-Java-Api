package Cofrinho;

public class Dolar extends Moeda{
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Moeda: Dolar");
    }

    @Override
    public double converterMoeda() {
        double taxaDeCambio = 5.48;
        return this.valor * taxaDeCambio;
    }
}
