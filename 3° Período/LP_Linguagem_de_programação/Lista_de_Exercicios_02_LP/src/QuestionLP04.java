import java.util.Scanner;

public class QuestionLP04 {
    public static int maiorValor (int[] valor, int i, int maior){
        
        if (i >= valor.length){
            return maior;
        } else{
            if (valor[i] > maior) {
            maior = valor[i];
            }
            return maiorValor(valor, i+1, maior);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[5];

        for (int i = 0; i < valores.length; i++){
            System.out.printf("\nPor favor, me informe o %d° valor: ",(i +1));
            valores[i] = sc.nextInt();
        }

        int maiorV = maiorValor(valores, 0, 0);

        System.out.printf("O maior valor e: %d", maiorV);

        sc.close();
    }

}
