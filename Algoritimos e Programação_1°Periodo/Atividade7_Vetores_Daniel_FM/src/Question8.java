/*
Nome: Daniel Fernandes de Morais
RA: 12126602
Data 24/05/2025
 */

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char [] vogais = {'a', 'e', 'i', 'o', 'u'};
        char letra [] = new char[10];
        int qtdVogal = 0;

        for (int i = 0; i < letra.length; i++) { //Repetição geral

            System.out.println("Digite a " + (i +1) + "° LETRA: ");
            letra[i] = sc.next().charAt(0);

            //---------verificação de vogais-------------//

            for (char vogal : vogais) {

                if ( letra[i] == vogal ) {
                        qtdVogal++;
                        break;
                }
            }

        }
        System.out.println("-------------Resultado---------------");

        System.out.println("A quantidade de vogais foi de: " + qtdVogal);

        sc.close();
    }
}
