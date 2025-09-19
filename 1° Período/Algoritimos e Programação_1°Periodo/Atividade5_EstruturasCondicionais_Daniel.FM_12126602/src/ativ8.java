//Daniel Fernandes de Morais
// RA: 12126602
// 05/04/2025


import java.util.Scanner;

public class ativ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Este valor é negativo!");
        }else {
            System.out.println("Este valor é POSITIVO");
        }

        sc.close();
    }
}
