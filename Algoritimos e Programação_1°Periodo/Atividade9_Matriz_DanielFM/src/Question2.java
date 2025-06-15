/*
 * Nome: Daniel Fernandes de Morais
 * RA: 12126602
 * Data: 14/06/2025
 */

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valores [][] = new int[2][3];
        int valoresInvertidos [][] = new int [3][2];

        for (int i = 0; i < valores.length; i++){
            for (int j = 0; j < valores[i].length; j++){
                System.out.println("Por favor, digite o valor da linha " + (i+1) + ", coluna " + (j+1) + " : ");
                valores[i][j] = sc.nextInt();
            }
        }

        System.out.println("Valores digitados na matriz:");
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                System.out.print(valores[i][j] + " ");
            }
            System.out.println();
        }

        // Exibindo valores invertidos
        System.out.println("Valores invertidos na matriz:");
        System.out.println("Linhas se tornando coluna e colunas se tornando linhas");

        for (int i = 0; i < valoresInvertidos.length; i++){
            for (int j = 0; j < valoresInvertidos[i].length; j++){
                valoresInvertidos[i][j] = valores[j][i];
            }
        }

        System.out.println("Valores digitados na matriz:");
        for (int i = 0; i < valoresInvertidos.length; i++) {
            for (int j = 0; j < valoresInvertidos[i].length; j++) {
                System.out.print(valoresInvertidos[i][j] + " ");
            }
            System.out.println();
        }

        
        sc.close();
    }
}
