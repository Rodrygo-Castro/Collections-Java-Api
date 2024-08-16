package Cofrinho;

public class Real extends Moeda{

    public Real(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Moeda: Real");
    }

    @Override
    public double converterMoeda() {
        return this.valor;
    }
}
