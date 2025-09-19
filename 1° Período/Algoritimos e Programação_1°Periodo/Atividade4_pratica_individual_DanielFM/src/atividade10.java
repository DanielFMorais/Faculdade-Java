/*
@author: Daniel Fernandes de Morais
@version: 1.0 26/03/2025
@RA: 12126602
 */

import java.util.Scanner;

public class atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o seu nome? ");
        String nome = sc.nextLine();

        System.out.print("Qual a sua Altura? ");
        String altura = sc.nextLine();

        System.out.println("Prazer, " + nome + " é bom saber que você tem " + altura + " de altura.");

        sc.close();
    }
}
