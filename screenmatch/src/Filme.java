public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoDoFilme;

    void exibeFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Lançamento: " + anoDeLancamento);
    }

    void avaliacao(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}