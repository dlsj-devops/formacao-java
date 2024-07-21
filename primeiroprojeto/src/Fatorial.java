import java.util.Scanner;
/*
Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
 */
public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro maior ou igual a zero: ");
        int numero = input.nextInt();
        int fatorial = 1;

        if (numero == 0) {
            System.out.println(numero + "! = " + fatorial);
        }
        else {
            fatorial = numero;
            for (int i = numero; i >= 2; i--) {
                fatorial = fatorial * (i - 1);
            }
            System.out.println(numero + "! = " + fatorial);
        }
    }
}
