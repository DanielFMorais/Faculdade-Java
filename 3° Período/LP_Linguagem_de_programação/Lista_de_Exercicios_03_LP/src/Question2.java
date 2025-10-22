import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] valores = new int[20];
        int maior, menor = 0;
        int posicaoMaior = 0;
        int posicaoMenor = 0;

        // Lendo os valores
        for (int i = 0; i < valores.length; i++){
            System.out.printf("Digite o %d° valor: ", i+1);
            valores[i] = sc.nextInt();
        }

        // Inicializando maior e menor com o primeiro valor
        maior = valores[0];
        menor = valores[0];
        
        // Encontrando maior, menor e suas posições
        for (int i = 0; i < valores.length; i++){
            if (valores[i] > maior){
            maior = valores[i];
            posicaoMaior = i;
            }
            if (valores[i] < menor){
            menor = valores[i];
            posicaoMenor = i;
            }
        }

        // Imprimindo os resultados
        System.out.printf("O maior valor é %d na posição %d\n", maior, posicaoMaior);
        System.out.printf("O menor valor é %d na posição %d\n", menor, posicaoMenor);

        sc.close();
    }

}
