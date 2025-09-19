
/*
 * Nome: Daniel Fernandes de Morais
 * RA: 12126602
 * Data: 14/06/2025
 */

import java.util.Scanner;
public class Question1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valores [][] = {
            {1, 2, 3},
            {5, 4, 3}, 
            {9, 8, 7}
        };

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                System.out.print(valores[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();

    }
}
