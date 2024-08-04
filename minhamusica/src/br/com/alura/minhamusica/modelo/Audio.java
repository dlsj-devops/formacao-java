package br.com.alura.minhamusica.modelo;

public class Audio {
    private String titulo;
    private int totalReporducoes;
    private int totalCurtidas;
    private int classificao;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTotalReporducoes() {
        return totalReporducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificao() {
        return classificao;
    }

    public void curtir() {
        this.totalCurtidas++;
    }

    public void reproduzir() {
        this.totalReporducoes++;
    }
}
