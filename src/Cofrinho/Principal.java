package Cofrinho;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Cofrinho moedasNoCofre = new Cofrinho();

        moedasNoCofre.listarMoedas();
        System.out.println();

        moedasNoCofre.adicionarMoeda(new Real(5.0));
        moedasNoCofre.adicionarMoeda(new Dolar(10.0));
        moedasNoCofre.adicionarMoeda(new Euro(3.0));
        moedasNoCofre.listarMoedas();
        moedasNoCofre.valorTotalConvertidoDoCofre();

        Moeda removendoReal = new Real(5.0);
        moedasNoCofre.removerMoeda(removendoReal);
        System.out.println();

        moedasNoCofre.listarMoedas();
        moedasNoCofre.valorTotalConvertidoDoCofre();

    }
}
