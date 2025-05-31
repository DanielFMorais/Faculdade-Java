
/*
@author: Daniel Fernandes de Morais
@version: 1.0 26/03/2025
@RA: 12126602
 */

import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorLata, capacidadeLata, ConsumoLata, TamanhoLata, tamanhoComodo, qtdComodo, qtdLatas;

        double valorFinal;

        valorLata = 50;
        ConsumoLata = 15;
        tamanhoComodo = 10;
        qtdComodo = 6;

        qtdLatas = (tamanhoComodo * qtdComodo) / ConsumoLata;

        valorFinal = qtdLatas * valorLata;

        System.out.println("Você terá que comprar " + qtdLatas + " latas de tinta, e no total dará R$ " +
         valorFinal + " reais."
        );

        sc.close();

    }
}
