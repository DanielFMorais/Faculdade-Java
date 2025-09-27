import java.util.Scanner;

public class QuestionLP04 {
    public static int maiorValor (int[] valor, int i){
        
        if (i == valor.length - 1){
            return valor[i];
        }
        if (valor[i] > maiorValor(valor, i + 1)) {
            return valor[i];
        }
        return maiorValor(valor, i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[5];

        for (int i = 0; i < valores.length; i++){
            System.out.printf("\nPor favor, me informe o %d° valor: ",(i +1));
            valores[i] = sc.nextInt();
        }

        int maiorV = maiorValor(valores, 0);

        System.out.printf("O maior valor e: %d", maiorV);

        sc.close();
    }

}
