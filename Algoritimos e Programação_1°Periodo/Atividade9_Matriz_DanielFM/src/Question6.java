/*
 * Nome: Daniel Fernandes de Morais
 * RA: 12126602
 * Data: 15/06/2025
 */
import java.util.Scanner;

public class Question6 {
    
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        int[][] campo = {
            {0, -1, 0, 0, 0},
            {0, 0, 0, -1, 0},
            {0, 0, 0, 0, 0},
            {-1, 0, 0, 0, 0},
            {0, 0, -1, 0, 0}
        };

        boolean[][] revelado = new boolean[5][5];
        boolean perdeu = false;
        int seguros = 0;
        int totalSeguros = 25 - 4; // 4 bombas

        while (!perdeu && seguros < totalSeguros) {
            System.out.println("\nCampo:");
            System.out.println("  0 1 2 3 4");
            for (int i = 0; i < 5; i++) {
                System.out.print((i) + " ");
                for (int j = 0; j < 5; j++) {
                    if (revelado[i][j]) {
                        if (campo[i][j] == -1) {
                            System.out.print("* ");
                        } else {
                            System.out.print("0 ");
                        }
                    } else {
                        System.out.print("- ");
                    }
                }
                System.out.println();
            }
            System.out.print("Digite linha (0-4): ");
            int linha = sc.nextInt();
            System.out.print("Digite coluna (0-4): ");
            int coluna = sc.nextInt();

            if (linha < 0 || linha > 4 || coluna < 0 || coluna > 4) {
                System.out.println("Coordenada inválida!");
                continue;
            }
            if (revelado[linha][coluna]) {
                System.out.println("Já revelado!");
                continue;
            }
            revelado[linha][coluna] = true;
            if (campo[linha][coluna] == -1) {
                perdeu = true;
                System.out.println("Você encontrou uma bomba! Fim de jogo.");
            } else {
                seguros++;
                System.out.println("Seguro!");
            }
        }
        if (seguros == totalSeguros) {
            System.out.println("Parabéns! Você venceu!");
        }
        System.out.println("Campo final:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (campo[i][j] == -1) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
