package tarefa2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaDeCarrinho;

    public CarrinhoDeCompras() {
        this.listaDeCarrinho = new ArrayList<>();
    }

    public List<Item> getListaDeItens() {
        return listaDeCarrinho;
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaDeCarrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> listaTemporaria = new ArrayList<>();
        for (Item i : listaDeCarrinho) {
            if (i.getNome().equals(nome)) {
                listaTemporaria.add(i);
            }
        }
        listaDeCarrinho.removeAll(listaTemporaria);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item itens : listaDeCarrinho) {
            valorTotal += itens.getQuantidade() * itens.getPreco();
        }
        System.out.println("Valor total: " + valorTotal);
        return valorTotal;
    }

    public void exibirItem() {

        System.out.println("Lista de Item no Carrinho de Compras.");
        System.out.println();
        for (Item item : listaDeCarrinho) {
            System.out.println("Nome: " + item.getNome());
            System.out.println("Quantidade: " + item.getQuantidade());
            System.out.println("Preço: " + item.getPreco());
            System.out.println("Valor total pot Item: " + item.getQuantidade() * item.getPreco());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Poco c65", 850.0, 2);
        carrinho.adicionarItem("Tablet s9", 3000.0, 1);
        carrinho.removerItem("Poco c65");
        carrinho.exibirItem();
        carrinho.calcularValorTotal();

    }
}
