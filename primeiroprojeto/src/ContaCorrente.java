import java.util.Scanner;

public class ContaCorrente {
    public static void main(String[] args) {
        String nomeCliente = "Raimundo do Queijo";
        String tipoConta = "Corrente";
        double saldo = 2500;

        Scanner menu = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("1 - Consultar");
            System.out.println("2 - Receber");
            System.out.println("3 - Tranferir");
            System.out.println("4 - Sair");
            opcao = menu.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo: " + saldo);
                opcao = 0;
            }
            else if (opcao == 2) {
                System.out.println("Valor a receber: ");
                //Scanner receber = new Scanner(System.in);
                saldo = saldo + menu.nextDouble();
                opcao = 0;
            }
            else if (opcao == 3) {
                System.out.println("Valor a tranferir: ");
                Scanner transferir = new Scanner(System.in);
                double valor = transferir.nextDouble();
                if (valor>saldo) {
                    System.out.println("Saldo insuficiente");
                }
                else {
                    saldo = saldo - valor;
                }
            }
            else if (opcao == 4) {
                System.out.println("Saindo");
                break;
            }
        }
    }
}
