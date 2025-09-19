/*
@author: Daniel Fernandes de Morais
@version: 1.0 26/03/2025
@RA: 12126602
 */

import java.util.Scanner;

public class atividade16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite dividendo: ");
        double num = sc.nextDouble();
        System.out.print("Digiteo o divisor: ");
        double num2 = sc.nextDouble();

        double resto = num % num2;

        System.out.print("O valores selecionados foram: " + num + " e " + num2 +", e o Resto da divisão de " + num + " / " + num2 + " é de = " + resto);



        sc.close();
    }
}
