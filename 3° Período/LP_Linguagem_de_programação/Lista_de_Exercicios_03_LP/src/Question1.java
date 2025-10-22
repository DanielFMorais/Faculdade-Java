import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[10];

        System.out.println("Por favor, digite 10 numeros inteiros");
        //Lê os valores
        for (int i = 0; i < valores.length; i ++){
            System.out.printf("%d° número: ", i+1);
            valores[i] = sc.nextInt();
        }
        System.out.println("Os valor pares são: ");
        //Imprime os pares
        for (int i = 0; i < valores.length; i ++){
            if (valores[i] % 2 == 0){
                System.out.println(valores[i]);
            }
        }

        sc.close();
    }
}
