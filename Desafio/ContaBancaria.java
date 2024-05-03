package Desafio;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();
        System.out
                .println((idade <= 17) ? "Voce nao esta elegivel para criar uma conta bancaria." : scanner.nextLine());
        System.out.println((idade >= 18) ? "Voce esta elegivel para criar uma conta bancaria." : scanner.nextLine());
        scanner.close();
    }

}
