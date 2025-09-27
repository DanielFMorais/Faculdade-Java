import java.util.Scanner;

public class QuestionLP05 {
    int n = 0;
    public static int soma (int[] valores, int n){

        if (n == valores.length){
            return 0;
        } else {
            return valores[n] + soma(valores, n + 1); // Realiza a soma de todos os elementos com a função recursiva
            //Percorre o array realizando somas, até o momento de chegar no último valor somando com 0 (que não altera nenhum valor)
            //e realiza a recursão somando com os valores que ficaram pedenciados com cada retorno já resolvido.
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[5];

        //Input de valores dentro do ARRAY
        for (int i = 0; i < valores.length; i++){
            System.out.printf("\nPor favor, me informe o %d° valor: ",(i +1));
            valores[i] = sc.nextInt();
        }

        int somaTotal = soma(valores, 0);

        System.out.printf("A soma total deste Array é =  %d", somaTotal);

        sc.close();
    }


}
