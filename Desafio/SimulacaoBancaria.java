package Desafio;

import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        System.out.println(
                "1. Depositar \n" +
                        "2. Sacar \n" +
                        "3. Consultar Saldo \n" +
                        "4. Encerrar");
        while (true) {
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    saldo = scanner.nextDouble();
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 2:
                    double saque = scanner.nextDouble();
                    if (saque < saldo) {
                        saldo = saldo - saque;
                        System.out.println("Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }
    }
}
