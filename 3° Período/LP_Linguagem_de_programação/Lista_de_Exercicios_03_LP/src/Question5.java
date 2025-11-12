import java.util.Random;

public class Question5 {
    public static void main(String[] args) {
        
        Random r = new Random();

        int [] valores = new int[30];
        int soma = 0;
        for (int i = 0; i < valores.length; i++){
            valores[i] = r.nextInt(100);
        }

        for (int n : valores){
            System.out.print (n + " ");
        }

        for (int i = 0; i < valores.length; i++){
            if (valores [i] % 5 == 0){
                soma += valores[i];
            }
        }

        System.out.printf("\n\nsoma dos multiplos de 5 são: %d", soma);
        
    }
}
