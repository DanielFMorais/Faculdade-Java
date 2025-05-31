/*
@author: Daniel Fernandes de Morais
@version: 1.0 26/03/2025
@RA: 12126602
 */

import java.util.Scanner;

public class atividade20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Me informe a nota da primeira prova:  ");
        double primeiraNota = sc.nextDouble();
        System.out.print("Agora me informe a nota da segunda prova:  ");
        double segundaNota = sc.nextDouble();
        System.out.print("Por fim, me informe a nota da terceiro prova: ");
        double terceiraNota = sc.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraNota) / 3;

        System.out.printf("A média das notas foi de: %.2f", media);

        sc.close();
    }
}
