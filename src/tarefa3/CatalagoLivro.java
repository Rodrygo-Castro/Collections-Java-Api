package tarefa3;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivro {
    private List<Livro> livroList;

    public CatalagoLivro() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livroPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisaPorIntervalosDeAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosIntervalosDeAnos = new ArrayList<>();
        for (Livro l : livroList) {
            if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                livrosIntervalosDeAnos.add(l);
            }
        }
        return livrosIntervalosDeAnos;
    }

    public Livro pesquisaPoTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }


    public static void main(String[] args) {
        CatalagoLivro catalagoLivro = new CatalagoLivro();

        catalagoLivro.adicionarLivro("Livro 1","João", 2005);
        catalagoLivro.adicionarLivro("Livro 1","Maria", 2009);
        catalagoLivro.adicionarLivro("Livro 2","renan", 2012);
        catalagoLivro.adicionarLivro("Livro 3","Renata", 1990);
        catalagoLivro.adicionarLivro("Livro 4","Rodrigo", 1985);

        System.out.println(catalagoLivro.pesquisarPorAutor("Maria"));
        System.out.println(catalagoLivro.pesquisaPorIntervalosDeAnos(1985, 2000));
        System.out.println(catalagoLivro.pesquisaPoTitulo("Livro 2"));
    }
}
