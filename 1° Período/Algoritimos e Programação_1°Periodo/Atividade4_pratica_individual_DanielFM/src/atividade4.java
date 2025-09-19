/*
@author: Daniel Fernandes de Morais
@version: 1.0 24/03/2025
@RA: 12126602
 */

import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos °c está fazendo agora? ");
        double tempc = sc.nextDouble();

        System.out.println("-----------------");
        System.out.println("Calculando...");
        System.out.println("-----------------");

        double tempF = ((tempc * 9/5)+32);

        System.out.println("Temperatura em °F: " + tempF);

        sc.close();

    }
}
