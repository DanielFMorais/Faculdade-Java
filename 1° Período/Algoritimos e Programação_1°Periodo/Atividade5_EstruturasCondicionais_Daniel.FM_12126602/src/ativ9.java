//Daniel Fernandes de Morais
// RA: 12126602
// 05/04/2025

import java.util.Scanner;

public class ativ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a sua idede? ");
        int idade = sc.nextInt();

        if (idade >= 5 && idade <= 7){
            System.out.println("Você esta na categoria Infantil");
        } else if (idade >= 8 && idade <= 10){
            System.out.println("Você esta na categoria Juvenil");
        } else if (idade >= 11 && idade <= 15){
            System.out.println("Você esta na categoria Adolecente");
        } else if (idade >= 16 && idade <= 30){
            System.out.println("Você esta na categoria Adulto");
        } else if (idade > 30) {
            System.out.println("Você esta na categoria Sênior");
        } else {
            System.out.println("Você não pode nadar");
        }

        sc.close();
    }
}
