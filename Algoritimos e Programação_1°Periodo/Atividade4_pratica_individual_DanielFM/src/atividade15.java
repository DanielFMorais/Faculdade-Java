/*
@author: Daniel Fernandes de Morais
@version: 1.0 26/03/2025
@RA: 12126602
 */

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class atividade15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        System.out.println();
        System.out.println("Digite um numero: ");
        int num2 = sc.nextInt();
        System.out.println();
        System.out.println("Digite um numero: ");
        int num3 = sc.nextInt();
        System.out.println();

        double soma = num + num2 + num3;
        System.out.println("Soma: " + soma);
        System.out.println();

        double produto = num * num2 * num3;
        System.out.println("Produto: " + produto);

        sc.close();
    }
}
