//Daniel Fernandes de Morais
// RA: 12126602
// 05/04/2025

import java.util.Scanner;

public class ativ16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por valor, me informe o valor do depósito: ");
        double valor = sc.nextDouble();
        System.out.println("Me informe também o valor dos juros mensais: ");
        double juros = sc.nextDouble();

        double valorJuros = juros / 100;

        System.out.println("Me informe o valor dos juros que quer saber: ");
        System .out.println("[1] 1 Mês");
        System .out.println("[2] 2 Mês");
        System .out.println("[3] 3 Mês");
        int opcao = sc.nextInt();

        double valordeJuros = valor * valorJuros;

        if (opcao >= 1 && opcao <= 3) {
            double valorFinal = (valor + (valordeJuros * opcao ));
            switch (opcao) {
                case 1: System.out.println("Voce receberá no final de um mês o valor total de: " + valorFinal);
                break;
                case 2: System.out.println("Voce receberá no final de dois meses o valor total de: " + valorFinal);
                break;
                case 3: System.out.println("Voce receberá no final de três meses o valor total de: " + valorFinal);
                break;
            }
        }else {
            System.out.println("Você não selecionou uma das opções válidas.");
        }

        sc.close();
    }
}
