/*
Nome: Daniel Fernandes de Morais
RA: 12126602
 */

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] palavras = new String[5];

        for (int i = 0; i < palavras.length; i++) {
            System.out.println("Digite a " + (1+i) + " palavra: \n");
            palavras[i] = sc.nextLine();
        }

        for (int i = 0; i < palavras.length; i++) {
            System.out.println((i+1) + "° Palavra = " +palavras[i]);
        }

        sc.close();
    }
}
