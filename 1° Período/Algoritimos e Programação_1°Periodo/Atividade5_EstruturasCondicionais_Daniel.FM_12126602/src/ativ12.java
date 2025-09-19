//Daniel Fernandes de Morais
// RA: 12126602
// 05/04/2025

import java.util.Scanner;

public class ativ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Você NÃO É eleitor") ;
        } else if (idade >= 16 && idade <= 65) {
            System.out.println("Você é obrigado a votar.");
        } else if ((idade >= 16 && idade < 18) || idade > 65) {
            System.out.println("Se você tem entre 16 e 18 ou mais que 65, \nvocê vota se quiser ou não.");
        }

        sc.close();
    }
}
