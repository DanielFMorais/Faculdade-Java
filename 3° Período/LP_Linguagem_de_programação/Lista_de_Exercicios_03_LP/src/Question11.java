import java.util.Random;

public class Question11 {
    public static void main(String[] args) {
        Random r = new Random();
        int [][] matriz1 = new int[3][3];
        int [][] matriz2 = new int[3][3];
        int [][] matriz3 = new int[3][3];

        //Preenchimento matriz1
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz1[i][j] = r.nextInt(100);
            }
        }
        //mostrando matriz 1
        for (int[] linha : matriz1) {
            for (int valor : linha) {
                System.out.print(valor + "\t");  // TAB entre os valores
            }
            System.out.println(); // pular linha
        }
        System.out.printf("\n\n");
        //-----------------------------------------------------------------

        //preenchendo matriz 2
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                matriz2[i][j] = r.nextInt(100);
            }
        }
        //mostrando matriz2
        for (int[] linha : matriz2) {
            for (int valor : linha) {
                System.out.print(valor + "\t");  // TAB entre os valores
            }
            System.out.println(); // pular linha
        }
        System.out.printf("\n\n");
        //-------------------------------------------------------------------

        //calculando matriz 3
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[0].length; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        //mostrando matriz 3
        for (int[] linha : matriz3) {
            for (int valor : linha) {
                System.out.print(valor + "\t");  // TAB entre os valores
            }
            System.out.println(); // pular linha
        }


    
    }
}
