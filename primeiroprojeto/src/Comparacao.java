import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite primeiro número: ");
        double primeiro = entrada.nextDouble();

        System.out.println("Digite segundo número: ");
        double segundo = entrada.nextDouble();
        if (primeiro == segundo) {
            System.out.println("São iguais");
        }
        else if (primeiro < segundo) {
            System.out.println("primeiro < segundo");
        }
        else {
            System.out.println("primeiro > segundo");
        }

    }
}
