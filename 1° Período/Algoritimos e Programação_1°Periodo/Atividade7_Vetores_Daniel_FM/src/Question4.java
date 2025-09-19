/*
Nome: Daniel Fernandes de Morais
RA: 12126602
Data 24/05/2025
 */

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] valores = new double [8];
        double somaValores = 0;

        for (int i =0; i < valores.length; i++){
            System.out.println("Digite o " + (i+1) + " valor: ");
            valores[i] = sc.nextDouble();
            somaValores += valores[i];
        }

        double media = somaValores / valores.length;

        System.out.printf("A média encontrada foi de: %.2f ", media);


        sc.close();
    }
}
