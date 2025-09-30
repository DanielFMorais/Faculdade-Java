import java.util.Scanner;

public class QuestionLP06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] valores = new int[3][3];

        for (int i = 0; i < valores.length; i++){
            for (int j = 0; j < valores[i].length; j++){
                System.out.printf("\nPor favor me informe o valor da casa [%d] [%d]: ",i,j);
                int v = sc.nextInt();
                valores[i][j] = v;
            }
        }
        
        int a = valores[0][0];
        int b = valores[0][1];
        int c = valores[0][2];
        int d = valores[1][0];
        int e = valores[1][1];
        int f = valores[1][2];
        int g = valores[2][0];
        int h = valores[2][1];
        int i = valores[2][2];

        System.out.println("\nMatriz informada:");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(valores[linha][coluna] + "\t");
            }
            System.out.println();
        }

        int determinante = a*(e*i - f*h) - b*(d*i - f*g) + c*(d*h - e*g);

        System.out.println("A determinte da Matriz: " + determinante);

        sc.close();
    }

}
