import java.util.Random;

public class Question8 {
    public static void main(String[] args) {
        Random r = new Random();

        int [][] matriz = new int[3][3];
        int somaDiagonal = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(100);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t"); // \t = tabulação
                if (i == j){
                    somaDiagonal += matriz[i][j];
                }
            }
            System.out.println();
        }

        System.out.printf("\nA soma da diagonal principal = %d", somaDiagonal);



    }

}
