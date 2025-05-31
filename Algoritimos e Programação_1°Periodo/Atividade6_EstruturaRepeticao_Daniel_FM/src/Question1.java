//Author: Daniel Fernandes de Morais
//RA: 12126602
//Data? 14 de Jan de 2025

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos começar o input de valores ");

        int quantPares = 0;
        int somaPares = 0;
        int quantImpar = 0;
        int somaImpar = 0;

        for (int i = 1; i <= 10; i++){
            System.out.println("Por favor, me informe o " + i + "° número inteiro diferente de zero");
            int valor = sc.nextInt();

            while (valor == 0){
                System.out.println("Este valor é igual a zero, ou seja, é inválido");
                System.out.println("Por favor, me informe o " + i + "° número inteiro diferente de zero");
                valor = sc.nextInt();
            }

            if (valor % 2 == 0) {
                quantPares++;
                somaPares += valor;
            } else {
                quantImpar++;
                somaImpar += valor;
            }
        }

        System.out.println("Quantidade de pares: " + quantPares);
        System.out.println("Soma pares: " + somaPares);
        System.out.println("Quantidade de impar: " + quantImpar);
        System.out.println("Soma impar: " + somaImpar);

        sc.close();
    }
}
