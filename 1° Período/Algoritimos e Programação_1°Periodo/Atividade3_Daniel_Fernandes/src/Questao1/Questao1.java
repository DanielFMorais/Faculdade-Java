package Questao1;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int valor1;

        System.out.println("Me informe um valor inteiro: ");
        valor1 = leia.nextInt();

        System.out.println ("O valor digitado é :" + valor1);

        leia.close();

    }
}
