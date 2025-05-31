//Author: Daniel Fernandes de Morais
//RA: 12126602
//Data: 16 de Jan de 2025

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor quero que me informe sua Altura(m) \ne seu sexo (M - Masculino / F - Feminino)");
        System.out.println("-----------------------------------------------------");
        int i = 0, qtdHomens = 0, qtdMulheres = 0;

        double maiorAltura = 0, menorAltura = 100, somaAlturaMulheres = 0;

        while (i < 50){
            System.out.print("Qual a sua Altura? ");
            double altura = sc.nextDouble();
            System.out.println("Qual é seu sexo? ");
            String sexo = sc.next();

            while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("M")){
                System.out.println("------------------------------------------");
                System.out.println("    VOCÊ DIGITOU UM VALOR INVÁLIDO ");
                System.out.println("Digite F para Feminino ou M para Masculino");
                System.out.println("------------------------------------------");
                sexo = sc.next();
            }

            if (altura > maiorAltura){
                maiorAltura = altura;
            }

            if (altura < menorAltura){
                menorAltura = altura;
            }

            if (sexo.equalsIgnoreCase("f")){
                somaAlturaMulheres += altura;
                qtdMulheres ++;
            }

            if (sexo.equalsIgnoreCase("m")){
                qtdHomens ++;
            }

            i++;
        }
        double mediaMulheres = somaAlturaMulheres / qtdMulheres;

        System.out.println("A MAIOR altura do grupo foi de: " + maiorAltura);
        System.out.println("A MENOR altura do grupo foi de: " + menorAltura);
        System.out.println("A média da altura das mulheres é: " + mediaMulheres);
        System.out.println("Tem ao todo " + qtdHomens + " Homem(s) no grupo sendo um percentual de " +
                ((qtdHomens * 100)/i) + "%");



        sc.close();
    }
}
