import java.util.Scanner;

public class QuestionLP05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual posição de Fibonacci você deseja? ");
        int v = sc.nextInt();

        if (v <= 0) {
            System.out.println("Você precisa digitar pelo menos 1 quantidade de fibonacci");
        }else if (v > 93) {
            System.out.println("Valor grande demais de Fibonacci, Por favor, escolhar uma sequencia até 93");
        }else if (v == 1) {
            System.out.println("1° Fibonacci: 0");
        }else if (v == 2){
            System.out.println("1° Fibonacci: 0");
            System.out.println("2° Fibonacci: 1");
        }else {
            long a = 0;
            long b = 1;
            System.out.printf("1° Fibonacci: %d\n",a);
            System.out.printf("2° Fibonacci: %d\n",b);
            
            for (int i = 3; i <= v; i++){
                long c = a + b;
                System.out.printf("%d° Fibonacci: %d\n",i,c);
                a = b;
                b = c;
            }
        }
        sc.close();
    }

}
/* O conceito de Fibonacci é o seguinte:

É uma sequência de números inteiros iniciada por 0 e 1.

Cada número após os dois primeiros é a soma dos dois números anteriores. */