/*
Nome: Daniel Fernandes de Morais
RA: 12126602
Data 24/05/2025
 */

public class Question2 {
    public static void main(String[] args) {
        double [] valores = new double []{1.0,1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9};

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valor: " + valores[i]);
        }

        System.out.println("Valores decrescente");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.println("Valor: " + valores[i]);
        }
    }
}
