/*
Nome: Daniel Fernandes de Morais
RA: 12126602
Data: 30 de Maio de 2025
 */

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor [] = {10, 20,30,40,50};

        System.out.println("por favor, me informe um valor");
        int valor = sc.nextInt();

        boolean localizado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (valor == vetor[i]) {
                System.out.println("O valor " + vetor[i] + " esta presente no vetor na posição " + i);
                localizado = true;
                break;
            }
        }

        if (!localizado){
            System.out.println("O Valor "+ valor + " NÃO ESTA no vetor");
        }
        sc.close();
    }
}
