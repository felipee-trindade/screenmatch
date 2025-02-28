import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.calculos.Recomendacao;
import br.com.screenmatch.modelo.Episodio;
import br.com.screenmatch.modelo.Filme;
import br.com.screenmatch.modelo.Serie;

public class App {
    public static void main(String[] args) throws Exception {
        Filme meuFilme = new Filme();
        Serie bb = new Serie();
        Episodio ep01 = new Episodio();
        Recomendacao recomendacao = new Recomendacao();


        meuFilme.setAnoDeLancamento(2022);
        meuFilme.setNome("Top Gun"); 
        meuFilme.exibirFichaTecnica();
        meuFilme.avaliar(8);
        meuFilme.avaliar(8);
        meuFilme.avaliar(10);
        meuFilme.setDuracaoEmMinutos(180);
        double d = meuFilme.mediaDasAvaliacoes();
        System.out.println(d);  


        bb.setNome("Breaking Bad");
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
        recomendacao.filtro(ep01);


    }
}
