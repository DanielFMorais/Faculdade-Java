/*
Nome: Daniel Fernandes de Morais
RA: 12126602
Data: 30 de Maio de 2025
 */



public class Question3 {
    public static void main(String[] args) {

        double primeiroVetor [] = {3.7, 8.2, 1.5, 6.9, 9.1, 2.4, 5.8, 7.3, 4.6, 0.9, 11.2, 13.5, 12.1, 14.7, 10.6, 15.3, 16.8, 18.0, 17.4, 19.9};
        double segundoVetor [] = {4.2, 7.8, 1.3, 9.6, 2.1, 6.5, 3.9, 8.4, 5.7, 0.6, 11.9, 13.2, 12.6, 14.8, 10.3, 15.7, 16.4, 17.2, 18.5, 19.7};
        double produtoVetor [] = new double[primeiroVetor.length];

        int centroEsq = ((primeiroVetor.length / 2)- 1); //9
        int centroDir = (primeiroVetor.length / 2); //10

        for (int i = 0; i < primeiroVetor.length; i++) {

            double produto = primeiroVetor[i] * segundoVetor[primeiroVetor.length - 1 - i];

            if (i % 2 == 0) {
                produtoVetor[centroEsq--] = produto;
            } else {
                produtoVetor[centroDir++] = produto;
            }
        }

        for (int i = 0; i < produtoVetor.length; i++) {
            System.out.printf("produtoVetor[%d] = %.3f%n", i, produtoVetor[i]);
        }
    }
}
