import java.util.Random;

public class Question14 {
    public static void main(String[] args) {
        Random r = new Random();
        int [][] matriz = new int[3][3];
        boolean resultado = true;

        // Preenchimento matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = r.nextInt(100);
            }
        }

        // Mostrando matriz
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }

        // Testando simetria
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz[0].length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    resultado = false;
                    break;
                }
            }
        }

        if (resultado) {
            System.out.println("A matriz é SIMÉTRICA");
        } else {
            System.out.println("A matriz NÃO é SIMÉTRICA");
        }
    }
}
