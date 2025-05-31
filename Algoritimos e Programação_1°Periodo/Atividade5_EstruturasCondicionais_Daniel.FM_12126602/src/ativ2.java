//Daniel Fernandes de Morais
// RA: 12126602
// 31/03/2025

import java.util.Scanner;

public class ativ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = sc.nextDouble();
        System.out.println("Digite outro valor: ");
        double valor2 = sc.nextDouble();

        double maior_valor = 0;

        if (valor > valor2) {
            maior_valor = valor;
            System.out.println("O maior do que o primeiro valor: " + maior_valor);
        }else{
            maior_valor = valor2;
            System.out.println("O maior do que o secundo valor: " + maior_valor);
        }

        sc.close();
    }
}
