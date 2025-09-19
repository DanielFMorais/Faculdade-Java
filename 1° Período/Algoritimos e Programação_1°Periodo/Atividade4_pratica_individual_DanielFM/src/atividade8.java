/*
@author: Daniel Fernandes de Morais
@version: 1.0 26/03/2025
@RA: 12126602
 */

import java.util.Scanner;

public class atividade8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do produto? ");
        double valor = sc.nextDouble();

        System.out.print("Quantas prestações estão em atraso? ");
        int quantidadeAtraso = sc.nextInt();

        double valorAcescimo = valor * 0.15;
        double valorAtraso = valorAcescimo * quantidadeAtraso;
        double valorFinalAtraso = valor + valorAtraso;
        double valorPagamento = valorFinalAtraso - (valorFinalAtraso * 0.15);

        System.out.printf("Você vai pagar no final das contas, contando os juros e descontos: %.2f\n", valorPagamento);

        sc.close();
    }
}
