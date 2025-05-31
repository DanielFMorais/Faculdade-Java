/*
@author: Daniel Fernandes de Morais
@version: 1.0 24/03/2025
@RA: 12126602
 */

import java.util.Scanner;

public class atividade3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor da Base-Maior do trapézio? ");
        double valorBM = sc.nextDouble();
        System.out.println("Qual o vaor da Base-Menor? ");
        double valorBmenor = sc.nextDouble();
        System.out.println("Qual a altura do trapézio? ");
        double valoralt = sc.nextDouble();


        double area = ((valorBM + valorBmenor) * valoralt)/2;

        System.out.printf("O valor da área do trapézio = %.2f", area);

        sc.close();
    }

}
