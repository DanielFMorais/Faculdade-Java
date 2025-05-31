//Author: Daniel Fernandes de Morais
//RA: 12126602
//Data: 16 de Jan de 2025

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double somaTotal = 0;
        double [] dobro = new double [5];

        for (int i = 0; i < 5; i++){

            System.out.println("Digite o " + (i + 1) + "° valor:");
            double valor = sc.nextDouble();

            somaTotal += valor;
            dobro[i] = valor;

        }

        double media = somaTotal / 5;

        System.out.println("___________________________________________________");
        System.out.println("A soma de todos os valores é de: " + somaTotal);
        System.out.println("A média de todos os valores é de: " + media);
        System.out.println("___________________________________________________");

        for (int i = 0; i < 5; i++){
            System.out.println("O dobro de " + dobro [i] + " é igual a " + (dobro[i] * 2));
        }


        sc.close();
    }
}
