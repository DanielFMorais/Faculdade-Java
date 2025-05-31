/*
Nome: Daniel Fernandes de Morais
RA: 12126602
Data 24/05/2025

 */

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char valores [] = new char[6];

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite o " + (1 + i) + "° caractere: ");
            valores[i] = sc.next().charAt(0);
        }
        System.out.println("------------------------------ \nOs valores digitados são:\n");
        System.out.println(valores);

        sc.close();
    }
}