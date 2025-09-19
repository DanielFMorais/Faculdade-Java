package questao11;

import java.util.Scanner;

public class questao11 {
    public static void main (String[] args){
        Scanner leia = new Scanner (System.in);

        System.out.println("Por favor me informe um número real: ");
        double valor = leia.nextDouble();

        double raiz = Math.sqrt(valor);

        System.out.printf("A raiz quadrada do seu valor = %.2f ", raiz);

        leia.close();

    }
}
