package br.com.alura.minhamusica.principal;

import br.com.alura.minhamusica.modelo.MinhasPreferidas;
import br.com.alura.minhamusica.modelo.Musica;
import br.com.alura.minhamusica.modelo.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Forever");
        musica.setCantor("kiss");

        for (int i = 0; i < 1000; i++) {
            musica.reproduzir();
        }

        for (int i = 0; i < 200; i++) {
            musica.curtir();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("jornal");
        podcast.setDescricao("jornal");
        podcast.setApresentador("joao");

        for (int i = 0; i < 1000; i++) {
            podcast.reproduzir();
        }

        for (int i = 0; i < 200; i++) {
            podcast.curtir();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(musica);
        minhasPreferidas.inclui(podcast);
    }
}
