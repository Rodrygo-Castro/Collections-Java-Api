package tarefa9;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtosCadastrados;

    public CadastroProdutos() {
        this.produtosCadastrados = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtosCadastrados.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPoNome() {
//        Set<Produto> produtoPorNome = new TreeSet<>(produtosCadastrados);
//        produtoPorNome.addAll(produtosCadastrados);
//        return produtoPorNome;

        // Ordena por nome, usando o compareTo implementado na classe Produto
        return new TreeSet<>(produtosCadastrados);
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new Produto.ComparatorPorPreco());
        produtoPorPreco.addAll(produtosCadastrados);
        return produtoPorPreco;
    }

    public void removerProduto(long codigo) {
        Set<Produto> produtoParaRemover = new HashSet<>();
        for (Produto p : produtosCadastrados) {
            if (p.getCodigo().equals(codigo)) {
                produtoParaRemover.add(p);
            }
        }
        produtosCadastrados.remove(produtoParaRemover);
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        System.out.println();

        cadastroProdutos.adicionarProduto(5L, "NoteBook i5", 2950.0, 1);
        cadastroProdutos.adicionarProduto(6L, "NoteBook i7", 3250.0, 1);
        cadastroProdutos.adicionarProduto(7L, "NoteBook i9", 3750.0, 1);
        cadastroProdutos.adicionarProduto(8L, "NoteBook i3", 2250.0, 1);
        cadastroProdutos.adicionarProduto(9L, "NoteBook Amd r5", 3250.0, 1);
        System.out.println();

        System.out.println("produtos por nome");
        Set<Produto> produtoPorNome = cadastroProdutos.exibirProdutoPoNome();
        for (Produto p : produtoPorNome) {
            System.out.println(p);
        }

//        System.out.println("produtos por preço");
//        Set<Produto> produtoPorPreco = cadastroProdutos.exibirProdutoPoNome();
//        for (Produto p : produtoPorPreco) {
//            System.out.println(p);
//        }
    }
}
