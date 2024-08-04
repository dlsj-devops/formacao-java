package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int MinutoPorEpisodio;
    private int numeroDeEpisodios;

    public int getMinutoPorEpisodio() {
        return MinutoPorEpisodio;
    }

    public void setMinutoPorEpisodio(int minutoPorEpisodio) {
        MinutoPorEpisodio = minutoPorEpisodio;
    }

    public int getNumeroDeEpisodios() {
        return numeroDeEpisodios;
    }

    public void setNumeroDeEpisodios(int numeroDeEpisodios) {
        this.numeroDeEpisodios = numeroDeEpisodios;
    }

    @Override
    public int getDuracaoDoFilmeEmMinutos() {
        return numeroDeEpisodios * getMinutoPorEpisodio();
    }
}
