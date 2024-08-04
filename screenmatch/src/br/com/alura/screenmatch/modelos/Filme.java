package br.com.alura.screenmatch.modelos;

public class Filme {
    public String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoDoFilme;

    void exibeFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Lançamento: " + anoDeLancamento);
    }

    public void setAvaliacao(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }


    public int getTotaldeAvaliacoes() {
        return totalDeAvaliacoes;
    }


}