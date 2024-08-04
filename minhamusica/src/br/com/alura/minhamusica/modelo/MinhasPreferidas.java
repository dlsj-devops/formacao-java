package br.com.alura.minhamusica.modelo;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso");
        }
        else {
            System.out.println(audio.getTitulo() + " está sendo bem avaliado");
        }
    }
}
