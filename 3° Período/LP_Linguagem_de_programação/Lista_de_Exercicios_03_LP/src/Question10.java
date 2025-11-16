public class Question10 {
    public static void main(String[] args) {
        int [][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    matriz[i][j] = 0;
                } else if (i < j){
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = -1;
                }
            }
        }

        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + "\t");  // TAB entre os valores
            }
            System.out.println(); // pular linha
        }

    }
}
