/*
@author: Daniel Fernandes de Morais
@version: 1.0 26/03/2025
@RA: 12126602
 */

import java.util.Scanner;

public class atividade17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 3 dígitos: ");
        int num = sc.nextInt();

        int unidade = num % 10;
        int dezena = (num / 10) % 10;
        int centena = (num / 100) % 10;

        System.out.println("Número invertido: " + unidade + dezena + centena);

        sc.close();
    }
}
