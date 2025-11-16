import java.util.Random;

public class Question18 {

    public static int somaVetor (int[] vetor, int i){
        if (i == vetor.length){
            return 0;
        }

        return vetor[i] + somaVetor(vetor, i + 1);
    }

    public static void main(String[] args) {
        Random r = new Random();

        int [] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {        
            vetor[i] = r.nextInt(100);
        }

        for (int n : vetor){
            System.out.printf(" %d", n);
        }

        System.out.printf("\n\nA soma do vetor = %d", somaVetor(vetor, 0));
    }

}
