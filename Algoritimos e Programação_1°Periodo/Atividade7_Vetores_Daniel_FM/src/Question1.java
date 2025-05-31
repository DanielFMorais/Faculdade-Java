/*
Nome: Daniel Fernandes de Morais
RA: 12126602
Data 24/05/2025
 */

public class Question1 {
    public static void main(String[] args) {
        int [] valores = new int []{1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valor: " + valores[i]);
        }

        System.out.println("Valores decrescente");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.println("Valor: " + valores[i]);
        }
    }
}
