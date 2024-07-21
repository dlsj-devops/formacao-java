import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = entrada.nextDouble();
        if (valor < 0) {
            System.out.println("Negativo");
        }
        else {
            System.out.println("Positivo");
        }
    }
}
