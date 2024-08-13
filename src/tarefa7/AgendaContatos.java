package tarefa7;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> listaContatos;

    public AgendaContatos() {
        this.listaContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        listaContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(listaContatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPoNome = new HashSet<>();
        for (Contato c : listaContatos) {
            if (c.getNome().startsWith(nome)) {
                contatosPoNome.add(c);
            }
        }
        return contatosPoNome;
    }

    public Contato atualizaNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : listaContatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        //agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Rodrigo", 1693614630);
        agendaContatos.adicionarContato("Rodrigo Castro", 1293614630);
        agendaContatos.adicionarContato("Pai", 1292458713);
        agendaContatos.adicionarContato("Mae", 1291524613);
        agendaContatos.adicionarContato("Amor", 1692789456);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Rodrigo"));


        System.out.println("Contatos atualizados: "+ agendaContatos.atualizaNumeroContato("Rodrigo Castro", 129495167));

        System.out.println(agendaContatos.pesquisarPorNome("Rodrigo Castro"));
    }
}
