//Author: Daniel Fernandes de Morais
//RA: 12126602
//Data: 16 de Jan de 2025

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0, voto5 = 0, voto6 =0, votoTotal=0;

        System.out.println("-----------------------------");
        System.out.println("      INICIO DA VOTAÇÃO");
        System.out.println("-----------------------------");

        System.out.println("Vote 1 para votar no Dayene");
        System.out.println("Vote 2 para votar na Luiz");
        System.out.println("Vote 3 para votar na Maria");
        System.out.println("Vote 4 para votar na Patrick");
        System.out.println("Vote 5 para votar NULO");
        System.out.println("Vote 6 para votar em BRANCO");
        System.out.println("Digite 0 Sair da votação");

        while (true){
            System.out.println(" ");
            System.out.print("Digite o seu voto: ");
            int voto = sc.nextInt();

            while (voto < 0 || voto > 6){
                System.out.println("----------------------------------------");
                System.out.println("VALOR DIGITADO INVALIDO, TENTE NOVAMENTE");
                System.out.println("----------------------------------------");

                System.out.println("Vote 1 para votar no Dayene ");
                System.out.println("Vote 2 para votar na Luiz");
                System.out.println("Vote 3 para votar na Maria");
                System.out.println("Vote 4 para votar na Patrick");
                System.out.println("Vote 5 para votar NULO");
                System.out.println("Vote 6 para votar em BRANCO");
                System.out.println("Digite 0 Sair da votação");
                System.out.println(" ");
                System.out.print("Digite o seu voto: ");
                voto = sc.nextInt();
            }

            if (voto == 0){
               break;
            }

            if (voto == 1){
                voto1++;
            } else if (voto == 2){
                voto2++;
            } else if (voto == 3){
                voto3++;
            } else if (voto == 4){
                voto4++;
            } else if (voto == 5){
                voto5++;
            } else {
                voto6++;
            }

        }

        votoTotal = (voto1+voto2+voto3+voto4+voto5+voto6);

        System.out.println("-----------------------------------");
        System.out.println("        CONTAGEM DE VOTOS");
        System.out.println("------------------------------------");

        System.out.println("Candidato(a) 1 - Dayene | " + voto1 + " votos - " + ((voto1 * 100)/votoTotal) + "%");
        System.out.println("Candidato(a) 2 - Luiz   | " + voto2 + " votos - " + ((voto2 * 100)/votoTotal) + "%");
        System.out.println("Candidato(a) 3 - Maria  | " + voto3 + " votos - " + ((voto3 * 100)/votoTotal) + "%");
        System.out.println("Candidato(a) 4 - Patrick| " + voto4 + " votos - " + ((voto4 * 100)/votoTotal) + "%");
        System.out.println("Candidato(a) 5 - Nulo   | " + voto5 + " votos - " + ((voto5 * 100)/votoTotal) + "%");
        System.out.println("Candidato(a) 6 - Branco | " + voto6 + " votos - " + ((voto6 * 100)/votoTotal) + "%");

        sc.close();
    }
}
