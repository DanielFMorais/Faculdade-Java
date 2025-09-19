/*
Nome: Daniel Fernandes de Morais
RA: 12126602
Data: 30 de Maio de 2025
 */

import java.util.Random;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int [] vetores  = new int[20];
        int qtdPares = 0;

        for (int i = 0; i < vetores.length; i++) {
            vetores[i] = rand.nextInt(100);
        }

        for (int i = 0; i < vetores.length; i++) {
            System.out.print(vetores[i] + ",");
        }

        for (int i = 0; i < vetores.length; i++) {
            if (vetores[i] % 2 == 0) {
               qtdPares++;
            }
        }

        System.out.println("\nQtd de pares: " + qtdPares);



        sc.close();
    }
}
