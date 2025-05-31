/*
Nome: Daniel Fernandes de Morais
RA: 12126602
Data: 30 de Maio de 2025
 */

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String descricao [] = new String[10];
        double valores [] = new double[descricao.length];

        for (int i = 0; i < descricao.length; i++) {
            System.out.println("Digite o nome do descricao: ");
            descricao[i] = sc.nextLine();
            System.out.println("Digite o valor do descricao: ");
            valores[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("Por favor, insira o valor de atualização de venda, quantos por cento de acrescimo terá?");
        double conversao = sc.nextDouble();


        System.out.println("----------------------------");
        System.out.println("Percentual de acrescimo nos produtos: " + conversao + "%");
        for (int i = 0; i < descricao.length; i++) {
            System.out.println("------------------------");
            System.out.println("Nome produto: " + descricao[i]);
            System.out.println("Valor base do produto: " + valores[i]);
            System.out.printf("Valor atualizado do produto: %.2f%n",(valores[i]+(valores[i] * (conversao /100))));
            System.out.println("-----------------------");
        }
        sc.close();
    }
}
