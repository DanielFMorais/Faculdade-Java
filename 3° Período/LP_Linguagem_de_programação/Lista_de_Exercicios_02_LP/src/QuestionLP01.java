import java.util.Scanner;

public class QuestionLP01 {

    public int n;

    public static int somaDigitos (int n){
        
        if (n < 10){
            return n;
        } else {
            return (n % 10 ) + somaDigitos(n / 10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor digite um valor inteiro");
        int valor = sc.nextInt();

        System.out.println("A soma de cada digito é de: ");
        
        int soma = somaDigitos(valor);

        System.out.println(soma);

        sc.close();
    }
}
