import java.util.Scanner;

public class QuestionLP07 {

    public static int mdc (int v1, int v2){
        int maior, menor;
        if (v1 > v2){
            maior = v1;
            menor = v2;
        } else {
            maior = v2;
            menor = v1;
        }
        
        if (maior % menor ==0){
            return maior / menor;
        } else{
            int resto = maior % menor;
            return mdc(resto, menor);
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
