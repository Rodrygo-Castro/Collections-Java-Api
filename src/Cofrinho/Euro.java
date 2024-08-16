package Cofrinho;

public class Euro extends Moeda{
    public Euro(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Moeda: Euro");
    }

    @Override
    public double converterMoeda() {
        double taxaDeCambio = 6.02;
        return this.valor * taxaDeCambio;
    }
}
