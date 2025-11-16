import java.util.Scanner;

public class Question17 {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // caso base 1
        }
        if (n == 1) {
            return 1; // caso base 2
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // recursão 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor me informe um valor para fibonacci");
        int valor = sc.nextInt();

        System.out.printf("O fibonacci %d = %d", valor, fibonacci(valor));

        sc.close();
    }

}
