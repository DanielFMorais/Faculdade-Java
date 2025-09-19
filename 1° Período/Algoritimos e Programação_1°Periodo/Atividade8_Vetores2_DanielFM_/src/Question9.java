/*
Nome: Daniel Fernandes de Morais
RA: 12126602
Data: 30 de Maio de 2025
 */

import java.util.Random;

public class Question9 {
    public static void main(String[] args) {
        Random rand = new Random();

        int vetor [] = new int[15];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(-10, 10);
        }

        System.out.println();
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " | ");
        }
    }
}
