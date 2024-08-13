package tarefa6;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnica {

    private Set<String> palavrasUnica;

    public ConjuntoPalavrasUnica() {
        this.palavrasUnica = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnica.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraParaRemover = null;
        for (String s : palavrasUnica) {
            if (s.equalsIgnoreCase(palavra)) {
                palavraParaRemover = s;
                break;
            }
        }
        palavrasUnica.remove(palavraParaRemover);
    }

    public String verificarPalavra(String palavra) {
        String verificarPorPalavra = null;
        if (!palavrasUnica.isEmpty()) {
            for (String s : palavrasUnica) {
                if (s.equalsIgnoreCase(palavra)) {
                    verificarPorPalavra = s;
                    break;
                }
            }
        }
        return verificarPorPalavra;
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnica);
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnica{" +
                "palavrasUnica=" + palavrasUnica +
                '}';
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnica conjuntoPalavrasUnica = new ConjuntoPalavrasUnica();

        conjuntoPalavrasUnica.adicionarPalavra("Rodrigo");
        conjuntoPalavrasUnica.adicionarPalavra("Rodrigo");
        conjuntoPalavrasUnica.adicionarPalavra("Renata");
        conjuntoPalavrasUnica.adicionarPalavra("Rose");
        conjuntoPalavrasUnica.adicionarPalavra("Renan");
        conjuntoPalavrasUnica.removerPalavra("Rodrigo");
        conjuntoPalavrasUnica.exibirPalavrasUnicas();

    }
}
