//Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos
// para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    double somaAvaliacoes;
    int numavaliacoes;

    void exibeFicha() {
        System.out.println("titutlo: " + titulo);
        System.out.println("Avaliacoes" + numavaliacoes);
    }

    void avaliacao(double nota) {
        numavaliacoes ++;
        avaliacao = nota;
        somaAvaliacoes += avaliacao;
    }

    double mediaAvaliacoes() {
        return somaAvaliacoes / numavaliacoes;
    }
}
