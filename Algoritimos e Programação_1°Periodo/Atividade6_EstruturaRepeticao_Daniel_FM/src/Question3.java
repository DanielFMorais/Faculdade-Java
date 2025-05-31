//Author: Daniel Fernandes de Morais
//RA: 12126602
//Data? 14 de Jan de 2025

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos começar a leitura dos seus valores");

        int qtdPositivos = 0;
        int qtdNegativos = 0;
        int somaPositivos = 0;
        int somaNegativos = 0;
        double mediaPositivos = 0;
        double mediaNegativos = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Digite o " + i + " valor: ");
            int valor = sc.nextInt();

            while (valor == 0){
                System.out.println("Você digitou um valor = 0, por favor, tente novamente");
                System.out.print("Digite o " + i + " valor: ");
                valor = sc.nextInt();
            }

            if (valor > 0){
                qtdPositivos++;
                somaPositivos += valor;

            } else {
                qtdNegativos++;
                somaNegativos += valor;
            }
        }
        if (qtdPositivos > 1) {
            mediaPositivos = somaPositivos / qtdPositivos;
        }

        if (qtdNegativos < 0) {
            mediaNegativos = somaNegativos / qtdNegativos;
        }

        System.out.println("--------------------------------------------------------------");
        System.out.println("Você escreveu " + qtdPositivos + " valores positivos!");
        System.out.println("A média de valores positivos escritos foi de " + mediaPositivos);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Você escreveu " + qtdNegativos + " valores negativos!");
        System.out.println("A média de valores negativos escritos foi de " + mediaNegativos);
        System.out.println("--------------------------------------------------------------");

        sc.close();
    }
}
