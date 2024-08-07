package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoDoFilmeEmMinutos;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoDoFilmeEmMinutos() {
        return duracaoDoFilmeEmMinutos;
    }

    public void setDuracaoDoFilmeEmMinutos(int duracaoDoFilmeEmMinutos) {
        this.duracaoDoFilmeEmMinutos = duracaoDoFilmeEmMinutos;
    }

    public String getNome() {
        return nome;
    }
}