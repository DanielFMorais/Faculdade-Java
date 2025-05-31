//Daniel Fernandes de Morais
// RA: 12126602
// 05/04/2025

import java.util.Arrays;
import java.util.Scanner;

public class ativ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Me informe o primeiro valor: ");
        int valor = sc.nextInt();
        System.out.print("Me informe o segundo valor: ");
        int seg = sc.nextInt();
        System.out.print("Me informe o terceiro valor: ");
        int ter = sc.nextInt();
        System.out.print("Me informe o quarto valor: ");
        int  qua = sc.nextInt();

        int [] valores = {valor, seg, ter, qua};

        Arrays.sort(valores);

        System.out.println(Arrays.toString(valores));

        sc.close();
    }
}
