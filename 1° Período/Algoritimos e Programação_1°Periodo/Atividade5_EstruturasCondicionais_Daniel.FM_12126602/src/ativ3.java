//Daniel Fernandes de Morais
// RA: 12126602
// 31/03/2025

import java.util.Scanner;
import java.util.Arrays;

public class ativ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = sc.nextInt();
        System.out.print("Digite outro valor: ");
        int valor2 = sc.nextInt();
        System.out.print("Digite outro valor: ");
        int valor3 = sc.nextInt();

        int [] numeros= {valor,valor2,valor3};

        Arrays.sort (numeros);

        System.out.println(Arrays.toString(numeros));


        sc.close();
    }
}
