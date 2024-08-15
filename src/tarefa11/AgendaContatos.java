package tarefa11;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContato;

    public AgendaContatos() {
        this.agendaContato = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContato.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContato.isEmpty()) { // Verifica se a agenda não está vazia
            agendaContato.remove(nome); // Remove o contato pelo nome
        }
    }

    public void exibirContato() {
        System.out.println(agendaContato);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = agendaContato.get(nome);
        if (numeroPorNome == null) {
            System.out.println("Contato não encontrado: " + nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Rodrigo", 1677775555);
        agendaContatos.adicionarContato("Renata", 1611115555);
        agendaContatos.adicionarContato("Rodrigo Castro", 1633335555);
        agendaContatos.adicionarContato("Renan", 1600005555);
        agendaContatos.adicionarContato("Luiz Fernando", 1699994444);

        agendaContatos.exibirContato();
        System.out.println();

        agendaContatos.removerContato("Renata");
        agendaContatos.exibirContato();
        System.out.println();


        System.out.println("Pesquisa pelo nome Luiz Fernando: "+ agendaContatos.pesquisarPorNome("Luiz Fernando"));


    }
}
