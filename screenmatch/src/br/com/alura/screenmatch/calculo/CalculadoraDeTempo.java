package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
/*
    public void inclui(Filme f) {
        tempoTotal+= f.getDuracaoDoFilmeEmMinutos();
    }

    public void inclui(Serie s) {
        tempoTotal+= s.getDuracaoDoFilmeEmMinutos();
    }
*/
    public void inclui(Titulo titulo) {
        System.out.println("Tempo do titulo: " + titulo);
        this.tempoTotal += titulo.getDuracaoDoFilmeEmMinutos();
    }

}
