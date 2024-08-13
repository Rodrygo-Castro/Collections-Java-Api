package tarefa5;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidado() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem "+ conjuntoConvidados.contarConvidado() +" Convidados dentro do set de Convidados.");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1214);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1217);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1216);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1217);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 1218);

        System.out.println("Existem "+ conjuntoConvidados.contarConvidado() +" Convidados dentro do set de Convidados.");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1216);
        System.out.println("Existem "+ conjuntoConvidados.contarConvidado() +" Convidados dentro do set de Convidados.");

        conjuntoConvidados.exibirConvidados();
    }
}
