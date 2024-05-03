package Desafio;

import java.util.Scanner;

public class Controlsaque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double limiteDiario = scanner.nextDouble();
        for (int i = 1; i != 0;) {

            double primeir_saque = scanner.nextDouble();

            if (primeir_saque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                i = 0;
            }

            else if (primeir_saque < limiteDiario) {
                if (primeir_saque == 0) {
                    System.out.println("Transacoes encerradas.");
                    return;
                }
                limiteDiario = limiteDiario - primeir_saque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);

            } else if (primeir_saque == 0) {
                System.out.println("Transacoes encerradas.");
                i = 0;
            }
        }
        scanner.close();
    }

}

// Fechamos o Scanner para evitar vazamento de recursos:
