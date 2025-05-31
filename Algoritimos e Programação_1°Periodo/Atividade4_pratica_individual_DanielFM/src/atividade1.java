/*
@author: Daniel Fernandes de Morais
@version: 1.0 24/03/2025
@RA: 12126602
 */

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Por favor, digite um número: ");
        int valor1 = leia.nextInt();

        double valor2 = valor1 * valor1;

        System.out.println("O valor ao quadrado é: " + valor2);

        leia.close();

    }
}
