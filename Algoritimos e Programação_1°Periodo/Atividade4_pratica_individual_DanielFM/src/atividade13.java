/*
@author: Daniel Fernandes de Morais
@version: 1.0 26/03/2025
@RA: 12126602
 */

import java.util.Scanner;

public class atividade13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma numero: ");
        double numero = sc.nextDouble();
        System.out.println("Digite uma numero: ");
        double numero2 = sc.nextDouble();
        System.out.println("Digite uma numero: ");
        double numero3 = sc.nextDouble();
        System.out.println("Digite uma numero: ");
        double numero4 = sc.nextDouble();
        System.out.println("Digite uma numero: ");
        double numero5 = sc.nextDouble();

        double soma = (numero + numero2 +numero3 + numero4 + numero5);

        double media = soma / 5;

        System.out.println("soma = " + soma);
        System.out.println("médiao = " + media);

        sc.close();
    }
}
