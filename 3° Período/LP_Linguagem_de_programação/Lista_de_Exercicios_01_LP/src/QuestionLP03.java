import java.util.Scanner;

public class QuestionLP03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double[] valor = new double[10];

        System.out.print("\nPor favor, me informe o 1° valor: " );
        valor[0]= sc.nextDouble();

        for (int i = 1; i < valor.length; i++){

            valor[i] = valor[i-1] * 2;

        }

        for (int i = 0; i < valor.length; i++){
            System.out.printf("%.2f ", valor[i]);
        }


        sc.close();

    }

}
