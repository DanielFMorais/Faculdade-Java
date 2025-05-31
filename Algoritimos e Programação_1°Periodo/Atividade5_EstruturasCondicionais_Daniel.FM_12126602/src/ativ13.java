//Daniel Fernandes de Morais
// RA: 12126602
// 05/04/2025

import java.util.Scanner;

public class ativ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor A: ");
        double valorA = sc.nextDouble();
        System.out.print("Digite o valor B: ");
        double valorB = sc.nextDouble();

        double valorC = 0;

        if (valorA == valorB) {
            double soma = valorA + valorB;
            valorC = soma;
        } else {
            double multiplicacao = valorA * valorB;
            valorC = multiplicacao;
        }

        System.out.println("Valor A: " + valorA + "\nValor B: " + valorB + "\nValor C: " + valorC);


        sc.close();
    }
}
