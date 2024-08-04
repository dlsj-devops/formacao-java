import br.com.alura.screenmatch.modelos.Calculadora;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Musica;
import br.com.alura.screenmatch.modelos.Pessoa;

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
    }
}