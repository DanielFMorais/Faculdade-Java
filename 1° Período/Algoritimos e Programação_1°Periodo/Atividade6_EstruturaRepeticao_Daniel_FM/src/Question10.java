//Author: Daniel Fernandes de Morais
//RA: 12126602
//Data: 18 de Jan de 2025


import java.util.Random;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroJogador = 0, c = 0;
        int numeroEscolhido = random.nextInt(100);
        //O número é gerado aleatóriamente... Boa sorte... está de 0 á 100


        while (numeroJogador != numeroEscolhido) {

            System.out.print("Tente adivinhar o número escolhido: ");
            numeroJogador = sc.nextInt();

            if (numeroJogador == numeroEscolhido) {
                break;
            }else {
                System.out.println("VOCÊ ERROU!");

                if (numeroJogador > numeroEscolhido) {
                    System.out.println("Você escolheu um número que é maior que o número escolhido");
                }else {
                    System.out.println("Você escolheu um número que é menor que o numero escolhido");
                }
                c++;
            }
        }

        System.out.println("PARABENS VOCÊ ACERTOU");
        System.out.println("A quantidade de tentativas foi de: " + c);


        sc.close();
    }
}
