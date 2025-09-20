import java.util.Scanner;

public class QuestionLP01 {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[10];

        for (int i = 0; i < valores.length; i++){
            System.out.print("\nPor favor, me informe o " + (i+1) + "° valor: " );
            int v = sc.nextInt();
            valores[i] = v;
        }

        System.out.print("\nValores Pares digitados: ");
        for (int i = 0; i < valores.length; i++){

            if (valores[i] % 2 ==0){
                System.out.printf("%d ", valores[i]);
            }

        }

        System.out.print("\n\nValores Impares digitados: ");
        for (int i = 0; i < valores.length; i++){

            if (valores[i] % 2 != 0){
                System.out.printf("%d ", valores[i]);
            }

        }
        sc.close();
    }
}
