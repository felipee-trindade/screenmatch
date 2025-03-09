package br.com.screenmatch.principal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.calculos.Recomendacao;
import br.com.screenmatch.modelo.Episodio;
import br.com.screenmatch.modelo.Filme;
import br.com.screenmatch.modelo.Serie;
import br.com.screenmatch.modelo.Titulo;

public class App {
    public static void main(String[] args) throws Exception {
        Filme meuFilme = new Filme("Top Gun", 2022);
        Filme filmeFelipe = new Filme("Eu robo", 2002);
        Filme filmeJoao = new Filme("Transformers", 2007);
        Serie bb = new Serie("Breaking Bad", 2006);
        Episodio ep01 = new Episodio();
        Recomendacao recomendacao = new Recomendacao();

        

        meuFilme.exibirFichaTecnica();
        meuFilme.avaliar(8);
        meuFilme.avaliar(8);
        meuFilme.avaliar(10);
        meuFilme.setDuracaoEmMinutos(180);

        filmeFelipe.exibirFichaTecnica();
        filmeFelipe.avaliar(3);
        filmeFelipe.avaliar(3);
        filmeFelipe.avaliar(5);
        filmeFelipe.setDuracaoEmMinutos(120);

        filmeJoao.exibirFichaTecnica();
        filmeJoao.avaliar(7);
        filmeJoao.avaliar(7);
        filmeJoao.avaliar(7);
        filmeJoao.setDuracaoEmMinutos(200);

        System.out.println("Classificação do " + meuFilme.getNome() + " Nota: " + meuFilme.getClassificacao());
        System.out.println("Classificação do " + filmeFelipe.getNome() + " Nota: " + filmeFelipe.getClassificacao());

        bb.setTemporadas(10);
        bb.setEpisodiosPorTemporada(10);
        bb.setMinutosPorEpisodio(50);
        System.out.println(bb.getDuracaoEmMinutos());
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluir(bb);
        calculadora.incluir(meuFilme);
        System.out.println(calculadora.getTempoTotal());


        ep01.setTotalVisualizacao(10001);
        System.out.println(ep01.getClassificacao());


        recomendacao.filtro(meuFilme);
        recomendacao.filtro(filmeFelipe);
        recomendacao.filtro(ep01);

        ArrayList<Titulo> listaFilme = new ArrayList<>();
        listaFilme.add(meuFilme);
        listaFilme.add(filmeFelipe);
        listaFilme.add(filmeJoao);
        listaFilme.add(bb);

        System.out.println(listaFilme);

        for (Titulo item : listaFilme) {
            System.out.println(item);
            if (item instanceof Filme filme) {
                System.out.println(filme.getClassificacao());
            }
        }

        Collections.sort(listaFilme);
        System.out.println(listaFilme);
        listaFilme.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(listaFilme);

        
    }
}
