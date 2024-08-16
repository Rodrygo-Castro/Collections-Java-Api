package tarefa13;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Eventos> agendaDeEventos;

    public AgendaEventos() {
        this.agendaDeEventos = new HashMap<>();
    }

    //No metodo estamos recebendo como parametro data, evento e atracao.
    public void adicionarEvento(LocalDate data, String nomeEvento, String nomeAtracao) {
        //Aqui estanciei o Eventos e passei no parametro nome do evento e atracao
        Eventos eventos = new Eventos(nomeEvento, nomeAtracao);
        //Aqui o Map recebe o put de add o elemento ou atualiza e passei a Key(data) e o Value(eventos)
        agendaDeEventos.put(data, eventos);
    }

    public void exibirAgenda() {
        //
        Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(agendaDeEventos);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        //Set<LocalDate> dataSet = agendaDeEventos.keySet();
        //Collection<Eventos> values = agendaDeEventos.values();

        LocalDate dataAtual = LocalDate.now();//a data atual
        LocalDate proximaData = null;
        Eventos proximoEvento = null;
        Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(agendaDeEventos);
        for (Map.Entry<LocalDate, Eventos> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: "+ proximoEvento +" acontecerá na data "+ proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, 8, 18), "Evento: Teens em Familia", "FTU");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 8, 25), "Evento: Fju no Domingo", "FJU");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 8, 30), "Evento: Unisocial EVGs", "EVG");

        agendaEventos.exibirAgenda();
        System.out.println();

        agendaEventos.obterProximoEvento();
    }
}
