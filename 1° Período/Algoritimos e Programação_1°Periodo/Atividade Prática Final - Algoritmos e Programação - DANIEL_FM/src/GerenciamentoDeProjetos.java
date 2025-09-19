/*
 * Nome: Daniel Fernandes de Morais
 * RA:12126602
 * Data: 15/06/2025
 */

import java.util.Scanner;

public class GerenciamentoDeProjetos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalProject = 2;
        String nameProjectPercent [][] = new String[totalProject][2];
        String nameProjectOrcam [][] = new String[totalProject][2];
        double valorInicial = 100;
        System.out.println("O VALOR INICIAL DO PROJETO É DE" + valorInicial + " MILHÕES");
        
        
        System.out.println("--------INICIANDO GERENCIAMENTO DE PROJETO-----------");

        for (int i = 0; i < totalProject; i++) {
            // Importa o nome do projeto
            System.out.println("Por favor, me informe o Nome do " + (i+1) + "º Projeto:");
            String nomeProjeto = sc.nextLine();
            nameProjectPercent[i][0] = nomeProjeto; 
            nameProjectOrcam[i][0] = nomeProjeto;

            // Importa e valida o percentual de conclusão
            System.out.println("_____________________");
            System.out.println("Muito obrigado, agora por favor, me informe o percentual de conclusão do " + (i+1) + "º Projeto:");
            String percentual;
            do {
                percentual = sc.next();
                if (!percentual.matches("\\d+") || Integer.parseInt(percentual) > 100 || Integer.parseInt(percentual) < 0) {
                    System.out.println("Por favor, digite apenas números entre 0 e 100 para o percentual de conclusão:");
                }
            } while (!percentual.matches("\\d+") || Integer.parseInt(percentual) > 100 || Integer.parseInt(percentual) < 0);
            nameProjectPercent[i][1] = percentual;

            // Importa e valida o orçamento
            System.out.println("_____________________");
            System.out.println("Muito obrigado, agora por favor, me informe o orçamento que foi utilizado (Em milhões) no  " + (i+1) + "º Projeto:");
            String orcamento;
            do {
                orcamento = sc.next();
                if (!orcamento.matches("\\d+(\\.\\d+)?")) {
                    System.out.println("Por favor, digite apenas números para o orçamento (pode usar ponto para decimais):");
                }
            } while (!orcamento.matches("\\d+(\\.\\d+)?"));
            nameProjectOrcam[i][1] = orcamento;
            System.out.println("------------------------------------------------------------");
            sc.nextLine();
        }
        
        //Verificação do percentual de conclusão > 75%
        System.out.println("\n\n_______________Empresas com mais de 75% de conclusão_______________");
        
        for (int i = 0; i < totalProject; i++) {
            if (Double.parseDouble(nameProjectPercent[i][1]) > 75){
                System.out.println("Empresa n° " + (i+1));
                System.out.println("Nome do Projeto: " + nameProjectPercent[i][0]);
                System.out.println("Total de conclusão do projeto: " + nameProjectPercent[i][1] + "%");
                System.out.println("Orçamento utilizado: " + nameProjectOrcam[i][1] + " milhões");
                System.out.println("------------------------------------------------------------");
            }            
        }

        //Verificação do gastos acima de 90% de orçamento
        System.out.println("\n\n_______________Empresas com gastos acima de 90% do orçamento_______________");

        for (int i = 0; i < totalProject; i++) {
            if (Double.parseDouble(nameProjectOrcam[i][1]) > 0.9 * valorInicial){
                System.out.println("Empresa n° " + (i+1));
                System.out.println("Nome do Projeto: " + nameProjectPercent[i][0]);
                System.out.println("Total de conclusão do projeto: " + nameProjectPercent[i][1] + "%");
                System.out.println("Orçamento utilizado: " + nameProjectOrcam[i][1] + " milhões");
                System.out.println("------------------------------------------------------------");
            }
        }
        sc.close();
    }
}
