/*
Nome: Daniel Fernandes de Morais
RA: 12126602
Data: 30 de Maio de 2025
 */

import java.util.Random;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int [] vetor  = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o " + (i + 1) + " valor: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\n-------------------");
        System.out.println("Resultado");

        int menor = vetor[0];
        int maior = vetor[0];
        int indiceMe = 0;
        int indiceMa = 0;

        for (int i = 0; i < vetor.length; i++) {
            
            if (vetor[i] < menor) {
                menor = vetor[i];
                indiceMe = i;
            }
            if (vetor[i] > maior) {
                maior = vetor[i];
                indiceMa = i;
            }
        }

        System.out.println("O maior valor foi " + maior + " e o índice deste valor foi " + indiceMa);
        System.out.println("O menor valor foi " + menor + " e o índice deste valor foi " + indiceMe);

        sc.close();
    }
}
