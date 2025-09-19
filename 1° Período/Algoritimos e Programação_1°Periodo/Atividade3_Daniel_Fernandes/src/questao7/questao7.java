package questao7;

import java.util.Scanner;

public class questao7 {
    public static void main (String[] args){

        Scanner leia = new Scanner (System.in);

        int valorint;
        double valordouble, resultado;

        System.out.println ("INFORME O PRIMEIRO VALOR (inteiro): ");
        valorint = leia.nextInt();
        System.out.println ("INFORME O SEGUNDO VALOR (Real): ");
        valordouble = leia.nextDouble();

        resultado = valorint + valordouble;

        System.out.printf ("A multiplicaçao de " + valorint + "x %.3f é igual á: %.2f",valordouble, resultado);

        leia.close();


    }

}
