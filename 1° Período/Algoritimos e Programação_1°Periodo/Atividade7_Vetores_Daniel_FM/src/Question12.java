/*
Nome: Daniel Fernandes de Morais
RA: 12126602
 */

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomes [] = new String[10];
        int idades [] = new int [nomes.length];
        double alturas [] = new double[nomes.length];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome da " + (i + 1)  + "° pessoa: ");
            nomes[i] = sc.nextLine();
            System.out.println("Agora por favor, digite a idade de " + nomes[i] + ": ");
            idades[i] = sc.nextInt();
            System.out.println("E por fim, por favor, digite a altura de " + nomes[i] + ": ");
            alturas[i] = sc.nextDouble();
            sc.nextLine();
            System.out.println("-----");
        }

        //___________RESULTADO__________

        System.out.println("----------Resultado---------------");

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Idade: " + idades[i]);
            System.out.println("Altura: " + alturas[i]);
            System.out.println("-------------------------------------------");
        }

        sc.close();
    }
}
