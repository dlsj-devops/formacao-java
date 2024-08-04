package br.com.alura.screenmatch.desafio;

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public double converterDolarParaReal(double valor, double taxaConversao) {
        return valor / taxaConversao;
    }
}
