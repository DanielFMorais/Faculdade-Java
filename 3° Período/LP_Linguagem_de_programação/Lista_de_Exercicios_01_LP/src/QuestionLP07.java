import java.util.Scanner;

public class QuestionLP07 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Por favor, digite um número de 2 a 5");
            n = sc.nextInt();
        } while (n < 2 || n > 5);

        int[][] matriz = new int[n][n];

        int valor = 1;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = valor;
                valor++;
            }
        }

        int[][] quadrado = new int[n][n];

        for (int i = 0; i < n; i++) {         
            for (int j = 0; j < n; j++) {      
                quadrado[i][j] = 0;            

                for (int k = 0; k < n; k++) { 
            
                    quadrado[i][j] += matriz[i][k] * matriz[k][j];
                }
               
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matriz[i][j]); 
            }
            System.out.println(); 
        }

        System.out.println("Quadrado da matriz (Matriz x Matriz):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", quadrado[i][j]); 
            }
            System.out.println();
        }



        sc.close();
    }

}
