import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        int numeroGerado = new Random().nextInt(100) ;

        Scanner leitura = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o palpite");
            int numero = leitura.nextInt();
            if (numero == numeroGerado) {
                System.out.println("Acertou o número gerado");
                break;
            }
            else {
                System.out.println("Palpite errado");
            }

            if (i == 5) {
                System.out.println("Esgotou o número de tentativas");
            }
        }
    }
}
