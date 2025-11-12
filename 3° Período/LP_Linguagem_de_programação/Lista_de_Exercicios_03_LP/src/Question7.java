import java.util.Random;

public class Question7 {
    public static void main(String[] args) {
        Random r = new Random();

        int [] valor = new int[10];
        int v, soma = 0;


        for (int i = 0; i < valor.length; i++){
            valor[i] = r.nextInt(100);
        }

        for (int n : valor){
            System.out.print(n + " ");
        }

        v = valor[0];
        for (int i = 0 ; i < valor.length; i++){
            if (i == 0){
                soma++;
            }
            if (valor[i] != v){
                soma++;
            }
            v = valor[i];
        }
        System.out.println();

        System.out.printf("\n\nA soma de numeros divergente é = %d", soma);
        
    }
}
