//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDofilme = 8.0;

        //media calculada pelas tres notas
        double media = (9.8 + 6.3 + 8.0) / 3;

        System.out.println("Media: " + media);

        String sinopse;
        sinopse = """
                    Top Gun
                    Filme de aventura
                   """;
        System.out.println("Sinopse: " + sinopse);

        int classificacao = (int) (media / 2);
        System.out.println("Classificacao: " + classificacao);
    }
}