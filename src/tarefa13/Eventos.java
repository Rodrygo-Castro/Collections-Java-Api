package tarefa13;

public class Eventos {
    private String nomeEvento;
    private String nomeAtracao;

    @Override
    public String toString() {
        return "Eventos{" +
                "nomeEvento='" + nomeEvento + '\'' +
                ", nomeAtracao='" + nomeAtracao + '\'' +
                '}';
    }

    public Eventos(String nomeEvento, String nomeAtracao) {
        this.nomeEvento = nomeEvento;
        this.nomeAtracao = nomeAtracao;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }
}
