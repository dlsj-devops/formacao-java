package br.com.alura.minhamusica.modelo;

public class Podcast  extends Audio{
    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificao() {
        if (this.getTotalReporducoes() > 100) {
            return 10;
        }
        else {
            return 7;
        }
    }
}
