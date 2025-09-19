//Author: Daniel Fernandes de Morais
//RA: 12126602
//Data: 18 de Jan de 2025

import javax.sound.sampled.Port;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0, c = 0;
        double somaValor = 0;

        System.out.println("Vamos começar o processo de contágem somente de números PARES");
        System.out.println("OBS: Não tem problema colocar números impares, somente não serão somados");
        System.out.println("------------------------------------------------------------------------");

        while (i == 0){
            System.out.println("OBS: Para parar de contar digite 0 \n" +
                    "Por favor, me informe um valor: ");

            double valor = sc.nextDouble();

            if ((valor % 2 == 0) && (valor > 0)){
                somaValor += valor;
                c++;
            }

            if (valor == 0){
                break;
            }

        }

        double media = somaValor / c;

        System.out.println("A média do valores fornecidos é de: " + media);

        sc.close();
    }
}
