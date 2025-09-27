import java.util.Scanner;

public class QuestionLP07 {

    public static int mdc(int v1, int v2) {
        if (v2 == 0) { // caso base
            return v1; //Caso o v2 seja igual a zero ele retorna o v2
        } else {
            return mdc(v2, v1 % v2); // chamada recursiva
            //Aqui os lados sempre se trocam
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, me informe o primeiro número do MDC: ");
        int v1 = sc.nextInt();
        System.out.println("Por favor, me informe o segundo do MDC: ");
        int v2 = sc.nextInt();

        int calculoMdc = mdc(v1, v2);

        System.out.printf("O MDC é: %d", calculoMdc);
        
        sc.close();
    }

}
