/*
@author: Daniel Fernandes de Morais
@version: 1.0 26/03/2025
@RA: 12126602
 */

import java.util.Scanner;

public class atividade19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, me informa o valor da base do triângulo: ");
        int base = sc.nextInt();

        System.out.print("Agora por favor, informe a altura do triângulo: ");
        double altura = sc.nextDouble();

        double Area = (base * altura) / 2;
        System.out.printf("A área do triângulo é de: %.2f ", Area);

        sc.close();
    }
}
