import java.util.Random;

public class Question9 {
    public static void main(String[] args) {
        Random r = new Random();
        int [][] matriz = new int[4][4];
        int maior = 0;
        String localizacao = "";

        // Preenche a matriz com números aleatórios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(100); // 0 a 99
            }
        }

        // Imprime a matriz formatada
        System.out.println("Matriz gerada:\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t"); // \t = tabulação (alinhamento)
            }
            System.out.println(); // quebra de linha só após imprimir toda a linha
        }

        maior = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] >= maior){
                    maior = matriz[i][j];
                    localizacao = "linha = " + (i+1) + " Coluna = " + (j+1);
                }
            }
        }

        System.out.printf("\n\nO maior valor = %d \nE a sua localização é a %s", maior, localizacao);

    }
}
