/*
 * Nome: Daniel Fernandes de Morais
 * RA: 12126602
 * Data: 15/06/2025
 */

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("  A   B   C");
        System.out.println("1   |   |  ");
        System.out.println("  ----------");
        System.out.println("2   |   |  ");
        System.out.println("  ----------");
        System.out.println("3   |   |  ");
        System.out.println("\n");

        String jogo [][] = {
            {
                " ", " ", " "
            },
            {
                " ", " ", " "
            },
            {
                " ", " ", " "
            }
        };
        
        int contRodadas = 0;
        boolean vitoria = false;
        int coluna, linha;
        char jogadaNumero, jogadaCasa;
        
        System.out.println("Regras: O primeiro a jogar é o X e o segundo é o O \nQUE COMEÇE OS JOGOS...");
        
        while (contRodadas < 9 && vitoria == false) {
            
            String jogador;
            if (contRodadas % 2 == 0) {
                jogador = "X";
            } else {
                jogador = "O";
            }
            do {

                System.out.println("Jogador "+ jogador + ": Selecione a casa que deseja jogar: [Primeiro Número - Depois Casa]");
                jogadaNumero = sc.next().charAt(0);
                
                while (jogadaNumero != '1' && jogadaNumero != '2' && jogadaNumero != '3') {
                    System.out.println("Resposta inválida, por favor, digite um número entre 1 e 3");
                    jogadaNumero = sc.next().charAt(0);
                }
                
                jogadaCasa = sc.next().toUpperCase().charAt(0);
                
                while (jogadaCasa != 'A' && jogadaCasa != 'B' && jogadaCasa != 'C') {
                    System.out.println("Resposta inválida, por favor, digite um número entre A e C");
                    jogadaCasa = sc.next().toUpperCase().charAt(0);
                }
                
                // Descritivo das casas
                if (jogadaNumero == '1') {
                    linha = 0;
                } else if (jogadaNumero == '2') {
                    linha = 1;
                } else {
                    linha = 2;
                }
        
                if (jogadaCasa == 'A') {
                    coluna = 0;
                } else if (jogadaCasa == 'B') {
                    coluna = 1;
                } else {
                    coluna = 2;
                }

                if (jogo[linha][coluna].equals("X") || jogo[linha][coluna].equals("O")){
                    System.out.println("----------------------------------");
                    System.out.println("Casa já ocupada escolha outra casa");
                    System.out.println("----------------------------------");
                } 
            } while (jogo[linha][coluna].equals("X") || jogo[linha][coluna].equals("O"));

            jogo [ linha ][ coluna ] = jogador; // = "X" ou "O"
            contRodadas++;
            System.out.println("    A   B   C");
            for (int i = 0; i < jogo.length; i++) {
                System.out.println((i+1)+"   " + jogo[i][0] + " | "  + jogo[i][1] + " | " + jogo[i][2]);
                if (i < 2) {
                    System.out.println("   -----------");
                }
            }
            
            // Verificação de vitória (sem função)
            if (
                // Linhas
                (jogo[0][0].equals(jogador) && jogo[0][1].equals(jogador) && jogo[0][2].equals(jogador)) ||
                (jogo[1][0].equals(jogador) && jogo[1][1].equals(jogador) && jogo[1][2].equals(jogador)) ||
                (jogo[2][0].equals(jogador) && jogo[2][1].equals(jogador) && jogo[2][2].equals(jogador)) ||
            
                // Colunas
                (jogo[0][0].equals(jogador) && jogo[1][0].equals(jogador) && jogo[2][0].equals(jogador)) ||
                (jogo[0][1].equals(jogador) && jogo[1][1].equals(jogador) && jogo[2][1].equals(jogador)) ||
                (jogo[0][2].equals(jogador) && jogo[1][2].equals(jogador) && jogo[2][2].equals(jogador)) ||
            
                // Diagonais
                (jogo[0][0].equals(jogador) && jogo[1][1].equals(jogador) && jogo[2][2].equals(jogador)) ||
                (jogo[0][2].equals(jogador) && jogo[1][1].equals(jogador) && jogo[2][0].equals(jogador))
            ) {
                System.out.println("\n------------------------------");
                System.out.println("      JOGADOR " + jogador + " VENCEU!");
                System.out.println("------------------------------");
                vitoria = true;
            }


            if (contRodadas == 9) {
                System.out.println("\n------------------------------");
                System.out.println("         DEU VELHA");
                System.out.println("--------------------------------");
            }
        }
        sc.close();
    }
}