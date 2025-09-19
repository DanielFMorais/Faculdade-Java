/*
@author: Daniel Fernandes de Morais
@version: 1.0 26/03/2025
@RA: 12126602
 */

import java.beans.Customizer;
import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Qual o custo de fabricação do veículo? ");
        double valorFabricacao = leia.nextDouble();

        double valorDistribuicao = 0.12 * valorFabricacao;
        double valorImpostos = 0.45 * valorFabricacao;
        double valorConsumidor  = valorDistribuicao + valorImpostos + valorFabricacao;

        System.out.printf("O valor pago de impostos é = %.2f \n", valorImpostos);
        System.out.printf("O valor pago de distribuição é = %.2f \n", valorDistribuicao);
        System.out.printf("O valor pago no total pelo comprador é = %.2f ", valorConsumidor);

        leia.close();


    }
}
