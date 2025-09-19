package questao5;

import java.util.Scanner;

public class questao5 {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);


        System.out.println ("--------------------------");
        System.out.println ("INFORME O PRIMEIRO VALOR: ");
            int valor1 = leia.nextInt();
        System.out.println ("--------------------------");
        System.out.println ("INFORME O SEGUNDO VALOR: ");
            int valor2 = leia.nextInt();
        System.out.println ("--------------------------");

            int soma = valor1 + valor2;

        System.out.println ("A soma de " + valor1 + "+" + valor1 + " é igual á: " + soma);



    }
}
