import java.util.Random;

public class Question20 {
    public static int maiorV(int[] vetor, int i){
        if (i == vetor.length - 1){
            return vetor[i];
        }

        if (vetor [i] > maiorV(vetor, i+1)){
            return vetor[i];
        }else{
            return maiorV(vetor, i+1);
        }
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

        System.out.printf("\n\nO Maior valor do vetor = %d", maiorV(vetor, 0));
    }
}
