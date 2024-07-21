/*
Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
 */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = entrada.nextDouble();

        for (int i = 1; i < 11; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
