import java.util.Scanner;

public class Question15 {
    
    public static int recursao (int n) {
        if (n == 1){
            return 1;
        }

        return n + recursao(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor me informe um valor inteiro");
        int valor = sc.nextInt();

        System.out.printf("A soma de 1 até o %d é de: %d", valor, recursao(valor));

        sc.close();
    }

}
