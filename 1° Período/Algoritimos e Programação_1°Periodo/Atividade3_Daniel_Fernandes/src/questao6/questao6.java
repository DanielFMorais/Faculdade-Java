package questao6;

import java.util.Scanner;

public class questao6 {
    public static void main (String[] args) {

        Scanner leia = new Scanner (System.in);


        double valor1, valor2, multiplicacao;


        System.out.println ("--------------------------");
        System.out.println ("INFORME O PRIMEIRO VALOR: ");
        valor1 = leia.nextDouble();
        System.out.println ("--------------------------");
        System.out.println ("INFORME O SEGUNDO VALOR: ");
        valor2 = leia.nextDouble();
        System.out.println ("--------------------------");

        multiplicacao = valor1 * valor2;

        System.out.println ("A multiplicaçao de " + valor1 + "x" + valor1 + " é igual á: " + multiplicacao);
    
        leia.close();
    }
}
