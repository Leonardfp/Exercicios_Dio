package Desafio;

import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        var verifica = new VerificadorNumeroConta();

        try {
            verifica.verificarNumeroConta(input);
            System.out.println((input.length() == 8) ? "numero valido" : "");

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Declaração do método verificarNumeroConta, que verifica se o número de conta
    // tem exatamente 8 dígitos:
    private void verificarNumeroConta(String numeroConta) {

        if (numeroConta.length() > 8 || numeroConta.length() < 8) {
            throw new VerificarNumConta("Numero de conta invalido. Digite exatamente 8 digitos.");
        }

    }

    public class VerificarNumConta extends IllegalArgumentException {
        public VerificarNumConta(String erro) {
            super(erro);
        }
    }
}
