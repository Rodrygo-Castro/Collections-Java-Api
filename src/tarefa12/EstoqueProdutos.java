package tarefa12;

import tarefa9.Produto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produtos> produtosNoEstoque;

    public EstoqueProdutos() {
        this.produtosNoEstoque = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quantidade, double preco) {
        produtosNoEstoque.put(cod, new Produtos(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(produtosNoEstoque);
    }

    public double calculaValorTotal() {
        double valorTotal = 0;
        if (!produtosNoEstoque.isEmpty()) {
            for (Produtos p : produtosNoEstoque.values()) {
                valorTotal += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotal;
    }

    public Produtos obterProdutoMaisCaro() {
        Produtos produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!produtosNoEstoque.isEmpty()) {
            for (Produtos p : produtosNoEstoque.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto 1", 15, 4.50);
        estoqueProdutos.adicionarProduto(2L, "Produto 2", 1, 2.50);
        estoqueProdutos.adicionarProduto(3L, "Produto 3", 3, 6.50);
        estoqueProdutos.adicionarProduto(4L, "Produto 4", 10, 10.50);
        estoqueProdutos.adicionarProduto(5L, "Produto 5", 50, 24.50);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: RS "+ estoqueProdutos.calculaValorTotal());
        //System.out.println("Produto mais caro: "+ estoqueProdutos.obterProdutoMaisCaro());
    }
}
