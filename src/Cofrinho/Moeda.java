package Cofrinho;

public abstract class Moeda {
    public double valor;

    public double getValor() {
        return valor;
    }

    public Moeda(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), valor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Moeda moeda = (Moeda) obj;
        return Double.compare(moeda.valor, valor) == 0;
    }

    public abstract void info();
    public abstract double converterMoeda();
}
