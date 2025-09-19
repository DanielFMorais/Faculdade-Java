/*
Nome: Daniel Fernandes de Morais
RA: 12126602
Data 24/05/2025

 */

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valores [] = new int[12];
        int valoresPares = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite o " + (i+1) + " valor: ");
            valores[i] = sc.nextInt();

            if (valores[i] % 2 == 0) {
                valoresPares++;
            }
        }

        System.out.println("\nA quantidade dos valores pares: " + valoresPares);
        sc.close();
    }
}
