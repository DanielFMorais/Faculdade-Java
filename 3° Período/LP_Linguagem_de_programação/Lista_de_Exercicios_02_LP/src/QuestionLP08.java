import java.util.Scanner;

public class QuestionLP08 {

    public static int pares (int[] vetor, int i){
        
        if (i == vetor.length){
            return 0;
        } 
        if (vetor[i] % 2 == 0){
            return 1 + pares(vetor, i + 1); // Recursão fazendo somar a quantidade de pares
        } else {
            return 0 + pares(vetor, i+ 1); // Se for impar vai somar da mesma forma mas irá somar 0
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[5];

        for (int i = 0; i < valores.length; i++){
            System.out.printf("\nPor favor, me informe o %d° valor: ",(i +1));
            valores[i] = sc.nextInt();
        }


        int quantidadePares = pares(valores, 0);

        
        System.out.printf("A quantidade de pares presentes no ARRAY é de: %d", quantidadePares);
    

        sc.close();
    }
}
