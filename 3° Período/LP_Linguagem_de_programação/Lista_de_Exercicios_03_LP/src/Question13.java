import java.util.Random;

public class Question13 {

    public static void main(String[] args) {
        Random r = new Random();
        int [][] matriz = new int[3][3];
        

        //Preenchimento matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = r.nextInt(100);
            }
        }

        //mostrando matriz
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + "\t");  // TAB entre os valores
            }
            System.out.println(); // pular linha
        }

        System.out.println("\nSoma de cada Linha:");
        for (int i = 0; i < matriz.length; i++) {
            int soma = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                soma += matriz[i][j];
            }
            System.out.printf("\nA soma da linha %d é de: %d", i, soma);
        }

        System.out.println("\nSoma de cada coluna:");
        for (int j = 0; j < 3; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 3; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.printf("\nA soma da coluna %d é de: %d", j, somaColuna);
        }
    }
}
