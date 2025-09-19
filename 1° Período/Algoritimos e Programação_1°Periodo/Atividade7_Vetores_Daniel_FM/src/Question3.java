/*
Nome: Daniel Fernandes de Morais
RA: 12126602
Data 24/05/2025
 */

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valores [] = new int[6];
        int somaValores = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite o " + (i +1) + " valor: ");
            valores[i] = sc.nextInt();
            somaValores += valores[i];
        }

        System.out.println("A soma é: " + somaValores);

        sc.close();
    }
}
