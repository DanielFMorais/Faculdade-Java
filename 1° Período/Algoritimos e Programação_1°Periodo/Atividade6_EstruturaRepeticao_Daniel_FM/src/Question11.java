//Author: Daniel Fernandes de Morais
//RA: 12126602
//Data: 18 de Jan de 2025

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vinhoTinto =0, vinhoBranco = 0, vinhoRose = 0;
        String tipoVinho = null;

        do {
            System.out.println("Escolha qual tipo de vinho:\n" +
                    "[T] Vinho Tinto\n" +
                    "[B] Vinho Branco\n" +
                    "[R] Vinho Rose\n" +
                    "[F] Sair\n");
            tipoVinho = sc.nextLine();

            if (tipoVinho.equalsIgnoreCase("F")) {
                break;
            }

            while (    !tipoVinho.equalsIgnoreCase("T") &&
                    !tipoVinho.equalsIgnoreCase("B") &&
                    !tipoVinho.equalsIgnoreCase("R") &&
                    !tipoVinho.equalsIgnoreCase("F")) {

                System.out.println("Você digitou um valor INVALIDO! Tente novamente.");
                tipoVinho = sc.nextLine();
            }

            System.out.println("Qual a quantidade deste vinho? ");
            int quantidade = sc.nextInt();
            sc.nextLine();

            switch (tipoVinho.toUpperCase()){
                case "T": vinhoTinto  += quantidade; break;
                case "B": vinhoBranco += quantidade; break;
                case "R": vinhoRose   += quantidade; break;
            }

        } while (!tipoVinho.equalsIgnoreCase("F"));

        int somatoriaVinho = vinhoTinto + vinhoBranco + vinhoRose;

        System.out.println("Temos no total " + somatoriaVinho + " vinhos. \n Sendo eles:");
        System.out.println("Vinho Tinto: " + vinhoTinto + "| Referente á " + ((vinhoTinto * 100) / somatoriaVinho) + "% dos vinhos.");
        System.out.println("Vinho Branco: " + vinhoBranco + "| Referente á " + ((vinhoBranco * 100) / somatoriaVinho) + "% dos vinhos.");
        System.out.println("Vinho Rose: " + vinhoRose + "| Referente á " + ((vinhoRose * 100) / somatoriaVinho) + "% dos vinhos.");

        sc.close();

    }
}
