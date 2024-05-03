package Desafio;

import java.util.Scanner;

public class Cheque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;
        if (saque > saldo) {
            double temp = saque - saldo;
            if (temp > limiteChequeEspecial) {
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            }
        }
        if (saque > saldo) {
            double temp = saque - saldo;
            if (temp < limiteChequeEspecial) {
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            }
        }
        System.out.println((saque < saldo) ? "Transacao realizada com sucesso." : "");

        scanner.close();

    }
}