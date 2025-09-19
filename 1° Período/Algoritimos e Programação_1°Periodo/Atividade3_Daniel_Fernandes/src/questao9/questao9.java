package questao9;

import java.util.Scanner;

public class questao9 {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);

        String valor1, valor2;
        boolean boolean1, boolean2, resultado;

        System.out.println("Digite se o primeiro valor é verdadeiro [V] e falso [F]: ");
        valor1 = leia.nextLine();
        boolean1 = valor1.equalsIgnoreCase("V");

        System.out.println("Digite se o Segundo valor é verdadeiro [V] e falso [F]: ");
        valor2 = leia.nextLine();
        boolean2 = valor2.equalsIgnoreCase("V");

        resultado = (boolean1 && boolean2);

        System.out.println("O resultados dos dois valores é = " + resultado);

        leia.close();

    }
}
