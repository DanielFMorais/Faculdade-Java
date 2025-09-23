//Daniel Fernandes de Morais
// RA: 12126602
// 05/04/2025


import java.util.Scanner;

public class ativ19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorG = 6.40;
        double valorA = 4.60;

        System.out.println("Qual o tipo de combustível que deseja comprar: ");
        System.out.println("________________");
        System.out.println("[1] Gasolina");
        System.out.println("[2] Álcool");
        System.out.println("________________");
        int tipo = sc.nextInt();

        String tipoComb;

        if (tipo == 1) {
            tipoComb = "Gasolina";
        } else if (tipo == 2) {
            tipoComb = "Álcool";
        } else {
            System.out.println("Você não selecionou um combustível disponível!");
            System.exit(0);
            sc.close();
            return;
    

        }

        System.out.println("Quantos litros de " + tipoComb + " Você deseja comprar: ");
        double litros = sc.nextDouble();


        double precoSemDesconto;
        double desconto;

        if (tipoComb.equals("Gasolina")) {
            precoSemDesconto = litros * valorG;
            if (litros <= 20) {
                desconto = precoSemDesconto * 0.04;
            } else {
                desconto = precoSemDesconto * 0.06;
            }
        } else { // Álcool
            precoSemDesconto = litros * valorA;
            if (litros <= 20) {
                desconto = precoSemDesconto * 0.03;
            } else {
                desconto = precoSemDesconto * 0.05;
            }
        }

        double preco = precoSemDesconto - desconto;

        System.out.printf("O valor a ser pago sera de: %.2f", preco);

        sc.close();
    }
}
