package Desafiocontrolefluxo;

import java.util.Scanner;

public class Control_fluxe {
    public static int resultado;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero 1: ");
        int valor1 = sc.nextInt();
        System.out.println("Numero 2:");
        int valor2 = sc.nextInt();
        sc.close();
        try {
            contador(valor1, valor2);
            System.out.println("  ");
            System.out.print("Numeros no Array:");
            for (int i = 0; i < resultado + 1; i++) {

                System.out.print("| " + i + " |");

            }
            System.out.println("\n");

        } catch (ParametrosInvalidosException e) {
            System.out.println(e);

        }

    }

    static void contador(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException("| O segundo parametro deve ser maior que o primeiro |");
        }
        resultado = parametro2 - parametro1;
    }
}
