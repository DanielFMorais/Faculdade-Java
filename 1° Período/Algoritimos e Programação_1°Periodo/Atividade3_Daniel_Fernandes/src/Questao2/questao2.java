package Questao2;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //Área de variáveis
        double valor1;

        System.out.println("Me informe um valor REAL:(separado por virgula) ");
        valor1 = leia.nextDouble();

        System.out.println("O valor digitado foi de: " + valor1);

        leia.close();
    }
}
