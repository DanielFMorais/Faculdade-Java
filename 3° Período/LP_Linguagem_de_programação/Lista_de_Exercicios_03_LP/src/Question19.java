import java.util.Random;

public class Question19 {

    public static int pares (int[] vetor, int i){
        if (i == vetor.length){
            return 0;
        }

        if (vetor[i] % 2 == 0 ){
            return 1 + pares(vetor, i + 1);
        }

        return pares(vetor, i+1);
    }

    public static void main(String[] args) {
        Random r = new Random();

        int [] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {        
            vetor[i] = r.nextInt(100);
        }

        for (int n : vetor){
            System.out.printf("%d ", n);
        }

        System.out.printf("\n\nO vetor tem um total de %d valores PARES", pares(vetor, 0));
    }

}
