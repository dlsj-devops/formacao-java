import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.desafio.Calculadora;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.desafio.Musica;
import br.com.alura.screenmatch.desafio.Pessoa;
import br.com.alura.screenmatch.modelos.Serie;

import java.io.SequenceInputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Poderoso chefão");

        System.out.println(meuFilme.getNome());

        meuFilme.setAvaliacao(10);
        meuFilme.setAvaliacao(5);
        meuFilme.setAvaliacao(2);
        meuFilme.setDuracaoDoFilmeEmMinutos(90);
        System.out.println("total de avaliacao: " + meuFilme.getTotaldeAvaliacoes());
        System.out.println("Média de avaliacoes: " + meuFilme.pegaMedia());

        Pessoa pessoa = new Pessoa();
        pessoa.mensagem();

        Calculadora calula = new Calculadora();
        System.out.println("dobro: " + calula.calculaDobro(3.15));

        Musica musica = new Musica();

        musica.titulo = "aquela musica";

        musica.avaliacao(1.34);
        musica.avaliacao(10);

        System.out.println("media: " + musica.mediaAvaliacoes());

        Serie lost = new Serie();
        lost.setAnoDeLancamento(2000);
        lost.setNumeroDeEpisodios(10);
        lost.setMinutoPorEpisodio(50);
        lost.getDuracaoDoFilmeEmMinutos();

        Filme outroFilme = new Filme();
        outroFilme.setNome("teste");
        outroFilme.setDuracaoDoFilmeEmMinutos(180);

        CalculadoraDeTempo calc = new CalculadoraDeTempo();

        calc.inclui(meuFilme);
        calc.inclui(outroFilme);
        calc.inclui(lost);

        System.out.println("Tempo total: " + calc.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();

        episodio.setSerie(lost);
        episodio.setTotalDeVisualizacoes(100);
        episodio.setNome("primeiro");

        filtro.filtra(episodio);
    }
}