//Author: Daniel Fernandes de Morais
//RA: 12126602
//Data: 17 de Jan de 2025

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        String [] paises = new String[3];
        int [] qtdMedalhasPais1 = new int[3];
        int [] qtdMedalhasPais2 = new int[3];
        int [] qtdMedalhasPais3 = new int[3];


        while (i < 3) {

            System.out.print("Por favor, me informe o nome do " + (i + 1) + "° País: ");
            String pais = sc.nextLine();

            paises[i] = pais;

            System.out.print("Quantas medalhas de Ouro o país " + paises[i] + " ganhou? ");
            int qtdMedalhasOuro = sc.nextInt();
            System.out.print("Quantas medalhas de Prata o país " + paises[i] + " ganhou? ");
            int qtdMedalhasPrata = sc.nextInt();
            System.out.print("Quantas medalhas de Bronze o país " + paises[i] + " ganhou? ");
            int qtdMedalhasBronze = sc.nextInt();
            sc.nextLine(); //Consumindo o enter do nextInt


            if (i == 0){
                qtdMedalhasPais1[0] = qtdMedalhasOuro;
                qtdMedalhasPais1[1] = qtdMedalhasPrata;
                qtdMedalhasPais1[2] = qtdMedalhasBronze;
            } else if (i == 1){
                qtdMedalhasPais2[0] = qtdMedalhasOuro;
                qtdMedalhasPais2[1] = qtdMedalhasPrata;
                qtdMedalhasPais2[2] = qtdMedalhasBronze;
            } else if (i == 2){
                qtdMedalhasPais3[0] = qtdMedalhasOuro;
                qtdMedalhasPais3[1] = qtdMedalhasPrata;
                qtdMedalhasPais3[2] = qtdMedalhasBronze;
            }
            System.out.println("-------------------------------------");
            i++;
        }

        int somaMedalhasPais1 = (qtdMedalhasPais1[0] * 3) + (qtdMedalhasPais1[1] * 2) + qtdMedalhasPais1[2];
        int somaMedalhasPais2 = (qtdMedalhasPais2[0] * 3) + (qtdMedalhasPais2[1] * 2) + qtdMedalhasPais2[2];
        int somaMedalhasPais3 = (qtdMedalhasPais3[0] * 3) + (qtdMedalhasPais3[1] * 2) + qtdMedalhasPais3[2];

        System.out.println("------------------------------");
        System.out.println("        RESULTADOS!!!");
        System.out.println("------------------------------");

        
        if ((somaMedalhasPais1>somaMedalhasPais2)&&(somaMedalhasPais1>somaMedalhasPais3)&&(somaMedalhasPais2>somaMedalhasPais3)){
            System.out.println("1° Lugar: " +paises[0]+ " | Ouro: " +qtdMedalhasPais1[0]+ " | Prata: " +qtdMedalhasPais1[1]+ " | Bronze: " +qtdMedalhasPais1[2]+ " | Total: " +somaMedalhasPais1);
            System.out.println("2° Lugar: " +paises[1]+ " | Ouro: " +qtdMedalhasPais2[0]+ " | Prata: " +qtdMedalhasPais2[1]+ " | Bronze: " +qtdMedalhasPais2[2]+ " | Total: " +somaMedalhasPais2);
            System.out.println("3° Lugar: " +paises[2]+ " | Ouro: " +qtdMedalhasPais3[0]+ " | Prata: " +qtdMedalhasPais3[1]+ " | Bronze: " +qtdMedalhasPais3[2]+ " | Total: " +somaMedalhasPais3);
        } else if ((somaMedalhasPais1>somaMedalhasPais2)&&(somaMedalhasPais1>somaMedalhasPais3)&&(somaMedalhasPais3>somaMedalhasPais2)){
            System.out.println("1° Lugar: " +paises[0]+ " | Ouro: " +qtdMedalhasPais1[0]+ " | Prata: " +qtdMedalhasPais1[1]+ " | Bronze: " +qtdMedalhasPais1[2]+ " | Total: " +somaMedalhasPais1);
            System.out.println("2° Lugar: " +paises[2]+ " | Ouro: " +qtdMedalhasPais3[0]+ " | Prata: " +qtdMedalhasPais3[1]+ " | Bronze: " +qtdMedalhasPais3[2]+ " | Total: " +somaMedalhasPais3);
            System.out.println("3° Lugar: " +paises[1]+ " | Ouro: " +qtdMedalhasPais2[0]+ " | Prata: " +qtdMedalhasPais2[1]+ " | Bronze: " +qtdMedalhasPais2[2]+ " | Total: " +somaMedalhasPais2);
        } else if ((somaMedalhasPais2>somaMedalhasPais1)&&(somaMedalhasPais2>somaMedalhasPais3)&&(somaMedalhasPais1>somaMedalhasPais3)) {
            System.out.println("1° Lugar: " +paises[1]+ " | Ouro: " +qtdMedalhasPais2[0]+ " | Prata: " +qtdMedalhasPais2[1]+ " | Bronze: " +qtdMedalhasPais2[2]+ " | Total: " +somaMedalhasPais2);
            System.out.println("2° Lugar: " +paises[0]+ " | Ouro: " +qtdMedalhasPais1[0]+ " | Prata: " +qtdMedalhasPais1[1]+ " | Bronze: " +qtdMedalhasPais1[2]+ " | Total: " +somaMedalhasPais1);
            System.out.println("3° Lugar: " +paises[2]+ " | Ouro: " +qtdMedalhasPais3[0]+ " | Prata: " +qtdMedalhasPais3[1]+ " | Bronze: " +qtdMedalhasPais3[2]+ " | Total: " +somaMedalhasPais3);
        } else if ((somaMedalhasPais2>somaMedalhasPais1)&&(somaMedalhasPais2>somaMedalhasPais3)&&(somaMedalhasPais3>somaMedalhasPais1)) {
            System.out.println("1° Lugar: " +paises[1]+ " | Ouro: " +qtdMedalhasPais2[0]+ " | Prata: " +qtdMedalhasPais2[1]+ " | Bronze: " +qtdMedalhasPais2[2]+ " | Total: " +somaMedalhasPais2);
            System.out.println("2° Lugar: " +paises[2]+ " | Ouro: " +qtdMedalhasPais3[0]+ " | Prata: " +qtdMedalhasPais3[1]+ " | Bronze: " +qtdMedalhasPais3[2]+ " | Total: " +somaMedalhasPais3);
            System.out.println("3° Lugar: " +paises[0]+ " | Ouro: " +qtdMedalhasPais1[0]+ " | Prata: " +qtdMedalhasPais1[1]+ " | Bronze: " +qtdMedalhasPais1[2]+ " | Total: " +somaMedalhasPais1);
        } else if ((somaMedalhasPais3>somaMedalhasPais1)&&(somaMedalhasPais3>somaMedalhasPais2)&&(somaMedalhasPais1>somaMedalhasPais2)) {
            System.out.println("1° Lugar: " +paises[2]+ " | Ouro: " +qtdMedalhasPais3[0]+ " | Prata: " +qtdMedalhasPais3[1]+ " | Bronze: " +qtdMedalhasPais3[2]+ " | Total: " +somaMedalhasPais3);
            System.out.println("2° Lugar: " +paises[0]+ " | Ouro: " +qtdMedalhasPais1[0]+ " | Prata: " +qtdMedalhasPais1[1]+ " | Bronze: " +qtdMedalhasPais1[2]+ " | Total: " +somaMedalhasPais1);
            System.out.println("3° Lugar: " +paises[1]+ " | Ouro: " +qtdMedalhasPais2[0]+ " | Prata: " +qtdMedalhasPais2[1]+ " | Bronze: " +qtdMedalhasPais2[2]+ " | Total: " +somaMedalhasPais2);
        } else if ((somaMedalhasPais3>somaMedalhasPais2)&&(somaMedalhasPais3>somaMedalhasPais1)&&(somaMedalhasPais2>somaMedalhasPais1)) {
            System.out.println("1° Lugar: " +paises[2]+ " | Ouro: " +qtdMedalhasPais3[0]+ " | Prata: " +qtdMedalhasPais3[1]+ " | Bronze: " +qtdMedalhasPais3[2]+ " | Total: " +somaMedalhasPais3);
            System.out.println("2° Lugar: " +paises[1]+ " | Ouro: " +qtdMedalhasPais2[0]+ " | Prata: " +qtdMedalhasPais2[1]+ " | Bronze: " +qtdMedalhasPais2[2]+ " | Total: " +somaMedalhasPais2);
            System.out.println("3° Lugar: " +paises[0]+ " | Ouro: " +qtdMedalhasPais1[0]+ " | Prata: " +qtdMedalhasPais1[1]+ " | Bronze: " +qtdMedalhasPais1[2]+ " | Total: " +somaMedalhasPais1);
        }



        sc.close();
    }
}
