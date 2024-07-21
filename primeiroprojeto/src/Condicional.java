public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDofilme = 8.4;
        String tipoPlano = "plus";

        if (anoLancamento > 2022) {
            System.out.println("Lançamento recente");
        }
        else {
            System.out.println("Filme retrô");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        }
        else {
            System.out.println("pagar locação");
        }
    }
}
