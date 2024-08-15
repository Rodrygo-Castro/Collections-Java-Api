package tarefa10;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosInteiros;

    public SomaNumeros() {
        this.numerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosInteiros.add(numero);
    }

    public Double calcularSoma() {
        double somaTotal = 0;
        for (Integer i : numerosInteiros) {
            somaTotal += i;
        }
        return somaTotal;
    }

    public  int encontrarMaiorNumero() {
        if (numerosInteiros == null || numerosInteiros.isEmpty()) {
            System.out.println("A lista não pode ser vazia");
        }

        int maior = numerosInteiros.get(0);

        for (int i : numerosInteiros) {
            if (i > maior) {
                maior = i;
            }
        }
        return  maior;
    }

    public  int encontrarMenorNumero() {
        if (numerosInteiros == null || numerosInteiros.isEmpty()) {
            System.out.println("A lista não pode ser vazia");
        }

        int menor = numerosInteiros.get(0);

        for (int i : numerosInteiros) {
            if (i < menor) {
                menor = i;
            }
        }
        return  menor;
    }
    
    public void exibirNumeros() {
        if (numerosInteiros.isEmpty()) {
            System.out.println("A lista está vazia.");
        }

        System.out.println("Numeros na lista:");
        for (Integer numero : numerosInteiros) {
            System.out.println(numero);
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(27);
        somaNumeros.adicionarNumero(133);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(18);

        System.out.println("Somando todos numeros da lista: "+ somaNumeros.calcularSoma());
        System.out.println();

        System.out.println("Maior numero da lista:"+ somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor numero da lista:"+ somaNumeros.encontrarMenorNumero());
        System.out.println();

        somaNumeros.exibirNumeros();
    }
}
