/*
@author: Daniel Fernandes de Morais
@version: 1.0 24/03/2025
@RA: 12126602
 */

import java.security.cert.CertPathValidatorResult;
import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual o Valor de custo do produto?");
        double valorproduto = leia.nextDouble();
        System.out.println("Qual a quantidade de produtos?");
        int quantidadeproduto = leia.nextInt();

        double valorTotal = quantidadeproduto * valorproduto;

        System.out.printf("O VALOR TOTAL DO PRODUTO É: %.2f ", valorTotal);

        leia.close();
    }
}
