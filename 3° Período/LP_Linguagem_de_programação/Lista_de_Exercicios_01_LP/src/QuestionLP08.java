import java.util.Scanner;

public class QuestionLP08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lendo dimensões da primeira matriz
        System.out.print("Digite o número de linhas da primeira matriz: ");
        int m1 = sc.nextInt();
        System.out.print("Digite o número de colunas da primeira matriz: ");
        int n1 = sc.nextInt();

        int[][] matriz1 = new int[m1][n1];
        
        // Preenchendo a primeira matriz
        System.out.println("Digite os elementos da primeira matriz:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.printf("Local [%d][%d]: ",i,j);
                matriz1[i][j] = sc.nextInt();
            }
        }

        // Lendo dimensões da segunda matriz
        System.out.print("Digite o número de linhas da segunda matriz: ");
        int m2 = sc.nextInt();
        System.out.print("Digite o número de colunas da segunda matriz: ");
        int n2 = sc.nextInt();

        int[][] matriz2 = new int[m2][n2];

        // Preenchendo a segunda matriz
        System.out.println("Digite os elementos da segunda matriz:");
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {                
                System.out.printf("Local [%d][%d]: ",i,j);
                matriz2[i][j] = sc.nextInt();
            }
        }

        // Verificação de compatibilidade
        if (n1 != m2) {
            System.out.println("Não é possível multiplicar essas matrizes!");
        } else {
            // Criando a matriz resultado
            int[][] resultado = new int[m1][n2];

            // Multiplicação
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    resultado[i][j] = 0;
                    for (int k = 0; k < n1; k++) {
                        resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                    }
                }
            }

            // Exibindo resultado
            System.out.println("Matriz resultado (A x B):");
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    System.out.printf("%5d", resultado[i][j]);
                }
                System.out.println();
            }
        }

        sc.close();
    }

}
