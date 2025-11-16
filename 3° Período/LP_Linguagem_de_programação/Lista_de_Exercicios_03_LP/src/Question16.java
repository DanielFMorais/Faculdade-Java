import java.util.Scanner;

public class Question16 {

    public static int fatorial (int n){
        if (n == 1){
            return 1;
        }

        return n * fatorial(n -1 );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor me informe um valor inteiro");
        int valor = sc.nextInt();

        System.out.printf("O fatorial de %d = %d", valor, fatorial(valor));

        sc.close();
    }
}
