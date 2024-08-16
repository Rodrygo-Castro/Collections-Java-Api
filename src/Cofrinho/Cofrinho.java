package Cofrinho;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {

    private List<Moeda> listaMoedasCofre;

    public Cofrinho() {
        this.listaMoedasCofre = new ArrayList<>();
    }

    public void adicionarMoeda(Moeda moeda) {
        listaMoedasCofre.add(moeda);
    }

    public void removerMoeda(Moeda moeda) {
        listaMoedasCofre.removeIf(m -> m.equals(moeda) && m.getValor() == moeda.getValor());
    }

    public void listarMoedas() {
        if (listaMoedasCofre.isEmpty()) {
            System.out.println("A lista de moedas está vazia.");
        } else {
            System.out.println("Lista de moedas no cofre:");
            for (Moeda moeda : listaMoedasCofre) {
                System.out.println(moeda);
            }
        }
    }

    public void valorTotalConvertidoDoCofre() {
        double totalDeMoedas = 0;
        for (Moeda moeda : listaMoedasCofre) {
            totalDeMoedas += moeda.converterMoeda();
        }
        System.out.printf("Total do valor convertido do cofre: %.2f%n", totalDeMoedas);
    }

}
