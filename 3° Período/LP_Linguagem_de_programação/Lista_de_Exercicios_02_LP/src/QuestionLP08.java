import java.util.Scanner;

public class QuestionLP08 {

    public static int pares (int[] vetor, int i,int pares){
        
        if (i >= vetor.length){
            return pares;
        } else { 
            if (vetor[i] % 2 == 0){
                pares++;
            }
            return pares(vetor, i+1, pares);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[5];

        for (int i = 0; i < valores.length; i++){
            System.out.printf("\nPor favor, me informe o %d° valor: ",(i +1));
            valores[i] = sc.nextInt();
        }


        int quantidadePares = pares(valores, 0,0);

        
        System.out.printf("A quantidade de pares presentes no ARRAY é de: %d", quantidadePares);
    

        sc.close();
    }
}
