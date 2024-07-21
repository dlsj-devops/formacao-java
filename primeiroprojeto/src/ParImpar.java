/*
Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
 */

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor = entrada.nextDouble();

        double resto = valor % 2;

        if (resto == 0) {
            System.out.println(valor + " é par");
        }
        else {
            System.out.println(valor + " é impar");
        }
    }
}
