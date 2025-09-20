import java.util.Scanner;

public class QuestionLP02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] valores = new int[10];
        double somaTotal = 0;
        int somaIndice = 0;

        for (int i = 0; i < valores.length; i++){
            System.out.print("\nPor favor, me informe o " + (i+1) + "° valor: " );
            int v = sc.nextInt();
            valores[i] = v;
        }
        System.out.println();
        for (int v : valores) {
            System.out.print(v + " ");
        }

        for (int i = 0; i < valores.length; i++){
            
            double soma = valores[i] * i;
            somaIndice += i;
            somaTotal +=  soma;

        }

        double mediaPonderada = somaTotal / somaIndice;

        System.out.printf("\n\na média ponderada é de: %.2f", mediaPonderada);

        sc.close();
    }

}
