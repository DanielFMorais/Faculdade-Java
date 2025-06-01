/*
 * Nome: Daniel Fernandes de Morais
 * RA: 12126602
 * Data Início: 31 de Maio de 2025
 * Data Término: 01 de Junho de 2025
 */

import java.util.Random;
import java.util.Scanner;

public class QuestionProMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        double consumoMedioKw [] = new double[20]; // KW
        double consumoMedioRs [] = new double[consumoMedioKw.length]; // Consumo do valor R$
        String nomeClientes [] = new String[consumoMedioKw.length];
        String codigoCliente [] = new String[consumoMedioKw.length];
        int meses = 12; // Meses de consumo

        System.out.print("\nInicialmente, qual a tarifa dos Kw: ");
        double tarifaKW = sc.nextDouble();
        sc.nextLine(); // Limpar o buffer do scanner
        System.out.println("----------------------------------------------------------------");

        for (int i = 0; i < consumoMedioKw.length; i++){

            System.out.print("\nQual o nome do " + (1 + i ) + "° Cliente: ");
            nomeClientes[i] = sc.nextLine();
            System.out.print("");
            codigoCliente[i] = String.valueOf(random.nextInt(0, 1000)); // Gerar código aleatório entre 0 e 999
            System.out.println("Código do cliente: " + codigoCliente[i]);

            for (int j = 0; j < meses; j++){
                System.out.print("\nMe informe o consumo de Kw no " + (1 + j) + "° mês do cliente " + nomeClientes[i] + ": ");
                double consumotemp = sc.nextDouble();
                double valortemp = consumotemp * tarifaKW;
                consumoMedioKw[i] += consumotemp;
                System.out.printf("\nO Valor da conta do " + (1 + j) + "° mês do cliente " + nomeClientes[i] + " é: R$%.2f\n", valortemp);
                if (j < meses - 1) {
                    System.out.println("-------");
                } else {
                    System.out.println("");
                }

                sc.nextLine(); // Limpar o buffer do scanner
            }
            
            if (i < consumoMedioKw.length - 1) {
                System.out.println("-----------------------------");
            } else {
                System.out.println("");
                System.out.println("----------------------------------------------------------------");
            }
            consumoMedioRs[i] = (consumoMedioKw[i] * tarifaKW) / meses;
        }
        //--------------------------- PESQUISA DE USUÁRIO ---------------------------

        System.out.println("Iniciando a pesquisa de usuário...");

        while (true) {
            System.out.print("\nMe informe o Nome ou código do cliente: [ou digite 'sair' para encerrar]: ");
            String pesquisa = sc.nextLine();

            if (pesquisa.equalsIgnoreCase("sair")) {
                System.out.println("Pesquisa encerrada.");
                break;
            }
            
            System.out.println("");
            boolean clienteEncontrado = false;
            for (int i = 0; i < consumoMedioKw.length; i++) {
                if (pesquisa.equalsIgnoreCase(nomeClientes[i]) || pesquisa.equalsIgnoreCase(codigoCliente[i])) {
                    System.out.println("Cliente encontrado: " + nomeClientes[i]);
                    System.out.println("Código do cliente: " + codigoCliente[i]);
                    System.out.printf("Consumo médio em Kw: %.2f Kw\n", (consumoMedioKw[i] / meses));
                    System.out.printf("Gasto médio em R$: R$%.2f\n", consumoMedioRs[i]);
                    clienteEncontrado = true;
                    System.out.println("----------------------------------------------------------------");
                }
            }
            if (!clienteEncontrado) {
                System.out.println("Cliente não encontrado pela Pesquisa: " + pesquisa);
            }

        }
        

        //--------------------------- Tabela de clientes totais -----
        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");

        System.out.println("\n              ~~TABELA DE CLIENTES~~\n");
        
        System.out.printf("%-20s | %-8s | %-18s | %-20s%n", "Cliente", "Código", "Consumo Médio (kWh)", "Valor Médio Mensal (R$)");
        System.out.println("--------------------------------------------------------------------------");
        
        for (int i = 0; i < consumoMedioKw.length; i++) {
            System.out.printf( "%-20s | %-8s | %-18.2f | %-20.2f%n",
            nomeClientes[i], codigoCliente[i], (consumoMedioKw[i] / meses), consumoMedioRs[i]);
        }
        sc.close();
    }
}
