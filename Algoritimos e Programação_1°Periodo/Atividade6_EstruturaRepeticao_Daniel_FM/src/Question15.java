//Author: Daniel Fernandes de Morais
//RA: 12126602
//Data: 18 de Jan de 2025

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0, total0_12= 0, total13_21= 0, total22_60= 0, totalMaior60= 0;

        do {

            System.out.println("Digite a idade da " + (i + 1) + "° Pessoa: ");
            System.out.println("Digite valor negativo para sair");
            int idade = sc.nextInt();

            if ((idade >= 0) && (idade <= 12)) {
                total0_12 ++;
            } else if ((idade >= 13) && (idade <= 21)) {
                total13_21 ++;
            } else if ((idade >= 22) && (idade <= 60)) {
                total22_60 ++;
            } else if (idade > 60) {
                totalMaior60 ++;
            } else {
                break;
            }
            i++;
        }while (true);

        System.out.println("==============================");
        System.out.println("        RESULTADO");
        System.out.println("===============================");

        System.out.println("Total de pessoas na faixa etária de 0 a 12 anos: " + total0_12);
        System.out.println("Total de pessoas na faixa etária de 13 a 21 anos: " + total13_21);
        System.out.println("Total de pessoas na faixa etária de 22 a 60 anos: " + total22_60);
        System.out.println("Total de pessoas na faixa etária acima de 60 anos: " + totalMaior60);


        sc.close();
    }
}
