/*
@author: Daniel Fernandes de Morais
@version: 1.0 24/03/2025
@RA: 12126602
 */

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a capacidade do tanque? (L): ");
        double capacidadeTanque = sc.nextDouble();

        System.out.print("Qual a quantidade abastecida? (L): ");
        double capacidadeAbastecida = sc.nextDouble();

        System.out.print("Qual a quilometragem percorrida desde o último abastecimento? ");
        double quilometragemPercorrida = sc.nextDouble();

        double consumoMedio = quilometragemPercorrida / capacidadeAbastecida;

        double autonomia = consumoMedio * capacidadeTanque;

        System.out.printf("Consumo médio: %.2f km/L\n", consumoMedio);
        System.out.printf("Autonomia estimada: %.2f km\n", autonomia);

        sc.close();
    }
}
