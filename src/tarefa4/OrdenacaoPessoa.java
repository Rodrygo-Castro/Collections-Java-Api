package tarefa4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoa() {
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Nome 1",18, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 2",25, 1.60);
        ordenacaoPessoa.adicionarPessoa("Nome 3",30, 1.65);
        ordenacaoPessoa.adicionarPessoa("Nome 4",15, 1.68);
        ordenacaoPessoa.adicionarPessoa("Nome 5",10, 1.72);
        ordenacaoPessoa.adicionarPessoa("Nome 5",45, 1.35);

        System.out.println(ordenacaoPessoa.listaPessoas);

//        System.out.println(ordenacaoPessoa.ordernarPorIdade());
//        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
