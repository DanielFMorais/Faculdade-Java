//Daniel Fernandes de Morais
// RA: 12126602
// 05/04/2025

import java.util.Scanner;

public class ativ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor1 = sc.nextInt();

        System.out.println("Vamos verificar se o valor que você colocou é PAR OU IMPAR ");

        int parimpar = valor1 % 2;

        if (parimpar == 0){
            System.out.println("O número é PAR");
        } else {
            System.out.println("O número é IMPAR");
        }

        sc.close();
    }


}
