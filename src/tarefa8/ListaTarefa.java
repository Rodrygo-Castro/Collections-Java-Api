package tarefa8;

import tarefa.ListaDeTarefas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {

    private Set<Tarefa> listaTarefas;

    public ListaTarefa() {
        this.listaTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        Set<Tarefa> tarefaParaRemover = new HashSet<>();
        for (Tarefa t : listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover.add(t);
            }
        }
        listaTarefas.removeAll(tarefaParaRemover);
    }

    public void exibirTarefa() {
        System.out.println(listaTarefas);
    }

    public int contarTarefas() {
        return listaTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : listaTarefas) {
            if (t.isConcluido()) {
                System.out.println("Adicionado tarefa concluida: "+ t.getDescricao());
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : listaTarefas) {
            if (!t.isConcluido()) {
                System.out.println("Adicionado tarefa pendente: "+ t.getDescricao());
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluido(true);
                System.out.println("Tarefa marcada como concluída: " + t.getDescricao());
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluido(false);
                System.out.println("Tarefa marcada como pendente: " + t.getDescricao());
                break;
            }
        }
    }

    public Set<Tarefa> removerListaTarefas() {
        Set<Tarefa> todasTarefas = new HashSet<>(listaTarefas);
        listaTarefas.clear();
        return todasTarefas;
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        // Adicionando tarefas
        listaTarefa.adicionarTarefa("Estudar Java");
        listaTarefa.adicionarTarefa("Estudar MySQL");
        listaTarefa.adicionarTarefa("Estudar Spring");
        listaTarefa.adicionarTarefa("Estudar PostGreSQL");

        System.out.println();

        // Marcando algumas tarefas como concluídas
        listaTarefa.marcarTarefaConcluida("Estudar Java");
        listaTarefa.marcarTarefaConcluida("Estudar MySQL");

        System.out.println();

        // Obtendo e exibindo as tarefas concluídas depois de marcá-las como concluídas
        Set<Tarefa> concluidas = listaTarefa.obterTarefasConcluidas();
        System.out.println("Tarefas concluidas: " + concluidas);

        System.out.println();

        // Obtendo e exibindo as tarefas pendentes
        Set<Tarefa> pendentes = listaTarefa.obterTarefasPendentes();
        System.out.println("Tarefas pendentes: " + pendentes);

        System.out.println();

        // Marcando "Estudar MySQL" como pendente e atualizando a lista de pendentes
        listaTarefa.marcarTarefaPendente("Estudar MySQL");
        pendentes = listaTarefa.obterTarefasPendentes();
        System.out.println("Tarefas pendentes: " + pendentes);

        // Marcando "Estudar Spring" como concluída e atualizando a lista de concluídas
        listaTarefa.marcarTarefaConcluida("Estudar Spring");
        concluidas = listaTarefa.obterTarefasConcluidas();
        System.out.println("Tarefas concluidas: " + concluidas);

        System.out.println();

        // Exibindo todas as tarefas
        listaTarefa.exibirTarefa();

        System.out.println();

        // Contando o total de tarefas
        int contarTarefas = listaTarefa.contarTarefas();
        System.out.println("Total de tarefas: " + contarTarefas);

    }
}
