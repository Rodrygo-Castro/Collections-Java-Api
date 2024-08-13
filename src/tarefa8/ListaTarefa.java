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
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : listaTarefas) {
            if (!t.isConcluido()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluido(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluido(false);
                break;
            }
        }
    }

    public Set<Tarefa> removerListaTarefas() {
        Set<Tarefa> removerTodasTarefas = new HashSet<>(listaTarefas);
        listaTarefas.clear();
        return removerTodasTarefas;
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Estudar Java");
        listaTarefa.adicionarTarefa("Estudar MySQL");
        listaTarefa.adicionarTarefa("Estudar Spring");

        //listaTarefa.contarTarefas();
        //listaTarefa.exibirTarefa();

//        listaTarefa.marcarTarefaConcluida("Estudar Java");
//        listaTarefa.marcarTarefaConcluida("Estudar MySQL");
//        listaTarefa.marcarTarefaPendente("Estudar Spring");

        listaTarefa.adicionarTarefa("Estudar PostGreSQL");
        listaTarefa.exibirTarefa();
        //listaTarefa.contarTarefas();

        listaTarefa.removerTarefa("Estudar PostGreSQL");
//        listaTarefa.contarTarefas();
//        listaTarefa.exibirTarefa();
//        listaTarefa.obterTarefasConcluidas();
//        listaTarefa.obterTarefasPendentes();
        listaTarefa.removerListaTarefas();
        listaTarefa.exibirTarefa();
    }
}
