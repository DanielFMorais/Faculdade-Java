//Daniel Fernandes de Morais
// RA: 12126602
// 05/04/2025

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ativ15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Me informe o primeiro valor: ");
        int primeiro = sc.nextInt();
        System.out.print("Me informe o segundo valor: ");
        int segundo = sc.nextInt();
        System.out.print("Me informe o terceiro valor: ");
        int terceiro = sc.nextInt();


        Integer [] valores = {primeiro, segundo, terceiro};

        Arrays.sort(valores, Collections.reverseOrder());

        System.out.println(Arrays.toString(valores));



        sc.close();


    }
}
