import java.util.Scanner;

public class QuestionLP02 {

    public static double potencialização (double base, double expoente) {
        if (expoente == 0){
            return 1.00;
        } else if (expoente == 1){
            return base;
        } else {
            return base * (potencialização(base, expoente - 1));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor me informe a Base da potencialização: ");
        double base = sc.nextDouble();

        System.out.print("Agora por favor, me informe o expoente da potencialização: ");
        double expoente = sc.nextDouble();

        double resultado = potencialização(base, expoente);

        System.out.printf("O resutado da potencialização de %.1f ^ %.1f = %.2f", base, expoente, resultado);

        sc.close();
    }

}
