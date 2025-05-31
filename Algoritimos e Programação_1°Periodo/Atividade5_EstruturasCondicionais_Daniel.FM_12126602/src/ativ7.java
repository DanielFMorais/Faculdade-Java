//Daniel Fernandes de Morais
// RA: 12126602
// 05/04/2025

import java.util.EmptyStackException;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class ativ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");

        int valor = sc.nextInt();

        if (valor <= 1) {
            System.out.println("Este valor não é primo");
        } else if (valor == 2 || valor == 3 || valor == 5 || valor == 7) {
            System.out.println("Este valor é primo");
        } else if (
                valor % 2 == 0 ||
                        valor % 3 == 0 ||
                        valor % 5 == 0 ||
                        valor % 7 == 0
        ) {
            System.out.println("Este valor não é primo");
        } else {
            System.out.println("Este valor é primo (não foi divisível por 2, 3, 5 ou 7)");
        }

        sc.close();
    }


}
