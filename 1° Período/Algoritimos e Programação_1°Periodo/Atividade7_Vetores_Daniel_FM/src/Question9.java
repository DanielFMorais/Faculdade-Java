/*
Nome: Daniel Fernandes de Morais
RA: 12126602
 */

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char letras [] = new char[8];

        for (int i = 0; i < letras.length; i++) {
            System.out.println("Digite a " + (i + 1) + "° letra: ");
            letras[i] = sc.next().charAt(0);
        }

        System.out.println("Resultado na ordem inversa");
        for (int i = letras.length - 1; i >= 0; i--) {
            System.out.print(letras[i] + ",");
        }

        sc.close();
    }
}
