package Questao4;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int valordefinido, valorinserido;

        boolean resultado;

        valordefinido = 10;

        System.out.println("Escolha um valor de 0 - 10 e falaremos se você acertou: ");
        System.out.println("TRUE = acertou / FALSE = Errou");
        valorinserido = leia.nextInt();

        resultado = (valorinserido == valordefinido);

        System.out.println ("Resposta correta? " + resultado);

    }
}
