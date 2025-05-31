//Daniel Fernandes de Morais
// RA: 12126602
// 05/04/2025

import java.util.Scanner;

public class ativ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Me informe código do produto (de 1 a 40): ");
        int produto = sc.nextInt();



        System.out.print("Me informa a quantidade de produtos: ");
        int quantidade = sc.nextInt();

        double valor = 0;

        if (produto >= 1 && produto <= 10) {
            valor = 10;
        }else if (produto >= 11 && produto <= 20) {
            valor = 15;
        }else if (produto >= 21 && produto <= 30) {
            valor = 20;
        }else if (produto >= 31 && produto <= 40) {
            valor = 30;
        }else {
            System.out.println("Você mandou um código invalido");
            System.exit(0);
        }

        double valorFinal = valor * quantidade;

        System.out.printf("O valor total sem desconto é de R$ %.2f\n", valorFinal);

        double valorDesconto = 0;
        if (valorFinal <= 250){
            valorDesconto = valorFinal - (valorFinal * 0.05);
        }else if (valorFinal >= 251 && valorFinal <= 500){
            valorDesconto = valorFinal - (valorFinal * 0.1);
        }else {
            valorDesconto = valorFinal - (valorFinal * 0.15);
        }

        System.out.printf("O valor final com desconto de R$ %.2f\n ", valorDesconto);

        sc.close();
    }
}
