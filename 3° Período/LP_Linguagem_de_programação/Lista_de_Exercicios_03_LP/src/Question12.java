import java.util.Random;

public class Question12 {
    public static void main(String[] args) {
        Random r = new Random();
        int [][] matriz = new int[4][4];
        int soma = 0;

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
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > 10){
                    soma++;
                }
            }
        }

        System.out.printf("A matriz tem um total de %d valores acima de 10",soma);
    }

}
