import java.util.Scanner;

/*
Crie um menu que oferece duas opções ao usuário:
"1. Calcular área do quadrado" e
"2. Calcular área do círculo".
Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
 */
public class CalculaArea {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Selecione uma opão: ");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        int opcao = entrada.nextInt();

        if (opcao != 1 && opcao != 2) {
            System.out.println("Opção inválida");
        }
        else {
            switch (opcao) {
                case 1: {
                    System.out.println("Digite o lado do quadrado: ");
                    double lado = entrada.nextDouble();
                    System.out.println("àrea do quadrado: " + lado * lado);
                    }
                case 2: {
                    System.out.println("Digite o raio do circulo: ");
                    double raio = entrada.nextDouble();
                    System.out.println("àrea do circulo: " + 2*3.14*raio);
                }
            }
        }
    }
}
