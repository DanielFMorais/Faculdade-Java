import java.util.Random;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[50];
        Random random = new Random();
        double divisão = 0;

        //Preenche o array
        for (int i = 0; i < valores.length; i++) {
            valores[i] = random.nextInt(100); // Gera números aleatórios
        }
        
        //Mostra o ARRAY preenchido
        for (int i = 0; i < valores.length; i++){
            System.out.print(valores[i] + " | ");
        }

        System.out.println("\n\nPor favor me informe uma posição de 1-50");
        int valor1 = sc.nextInt();
        System.out.println("Por favor me informe outra posição de 1-50");
        int valor2 = sc.nextInt();
        if(valores[valor2] == 0){
            System.out.println("Não é possível realizar esta divisão, valor dividido por 0");
        } else {
            divisão = valores[valor1]/valores[valor2];
        }

        System.out.printf("\n\nA divisão da posição %d (%d) e posição%d (%d) = %.2f", valor1,valores[valor1],valor2,valores[valor2], divisão);
        sc.close();
    }
}
