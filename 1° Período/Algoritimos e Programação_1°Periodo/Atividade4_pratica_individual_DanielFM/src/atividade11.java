/*
@author: Daniel Fernandes de Morais
@version: 1.0 26/03/2025
@RA: 12126602
 */

import java.util.Scanner;

public class atividade11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = sc.nextLine();
        System.out.println("Digite uma letra: ");
        String letra2 = sc.nextLine();
        System.out.println("Digite uma letra: ");
        String letra3 = sc.nextLine();
        System.out.println("Digite uma letra: ");
        String letra4 = sc.nextLine();
        System.out.println("Digite uma letra: ");
        String letra5 = sc.nextLine();

        System.out.println(letra  + letra2  + letra3  + letra4);
        System.out.println(letra  + "\n" + letra2 + "\n" + letra3 + "\n" + letra4);

        sc.close();
    }
}
