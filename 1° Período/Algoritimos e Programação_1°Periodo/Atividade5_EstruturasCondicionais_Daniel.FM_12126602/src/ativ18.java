//Daniel Fernandes de Morais
// RA: 12126602
// 05/04/2025

import java.util.Scanner;

public class ativ18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, me informe o seu peso (KG) : ");
        double peso = sc.nextDouble();
        System.out.println("Por favor, me informe o sua altura (cm): ");
        double altura = sc.nextDouble();
        double alturaCm = altura / 100;

        double imc = peso / (alturaCm * alturaCm);

        System.out.printf("IMC: %.2f\n", imc);

        if (imc < 20) {
            System.out.println("Você esta ABAIXO DO PESO");
        } else if (imc >= 21 && imc < 24.9) {
            System.out.println("Você esta com o peso NORMAL");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Você esta com EXCESSO DE PESO");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("Você ja esta com OBESIDADE");
        } else {
            System.out.println("Você esta com OBESIDADE MÓRBIDA");
        }



        sc.close();
    }
}
