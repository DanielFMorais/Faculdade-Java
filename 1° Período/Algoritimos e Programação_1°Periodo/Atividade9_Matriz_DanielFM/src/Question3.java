/*
 * Nome: Daniel Fernandes de Morais
 * RA: 12126602
 * Data: 14/06/2025
 */

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char cinema[][][] = {
            { //Sala 1
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L'}, //Fileira 1
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L'}, //Fileira 2
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L'}, //Fileira 3
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L'}, //FIleira 4
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L'}, //Fileira 5 
            },
            { //Sala 2
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L'}, //Fileira 1
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L'}, //Fileira 2
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L'}, //Fileira 3
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L'}, //FIleira 4
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L'}, //Fileira 5 
            },
            { //Sala3
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L'}, //Fileira 1
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L'}, //Fileira 2
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L'}, //Fileira 3
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L'}, //FIleira 4
                {'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L'}, //Fileira 5
            }
        };
        
        String resposta = "";

        while (!resposta.equalsIgnoreCase("s")) { //Enquanto a resposta não for igual a "s"
            System.out.println("--------------------------------------------------------------");
            System.out.println("Você deseja visualizar o mapa de acento ou reservar um acento?");
            System.out.println("\nPara vizualizar  o mapa de acento digite 'V' e para reservar um acento digite 'R'");
            System.out.println("Ou digite 'S' para sair do programa");
            resposta = sc.next();
            
            while (!resposta.equalsIgnoreCase("v") && !resposta.equalsIgnoreCase("r") && !resposta.equalsIgnoreCase("s")) {
                System.out.println("\nResposta invárlida, por favor, digite 'V' ou 'R' ou 'S'");
                resposta = sc.next();
            }

            
            if (resposta.equalsIgnoreCase("V")){
                
                System.out.println("Qual sala você deseja visualizar? (1, 2 , 3 ou 0 Para todas as salas)");
                int sala = sc.nextInt();
                
                while (sala != 1 && sala != 2 && sala != 3 && sala != 0) {
                    System.out.println("Resposta inválida, por favor, digite 1, 2, 3 ou 0 para todas as salas");
                    sala = sc.nextInt();
                }

                if (sala == 1 || sala == 2 || sala == 3){
                    System.out.println("--------------------------------------- ");
                    System.out.println("Mapa de acento da sala" + sala + " :");
                    for (int i = 0; i < cinema[sala - 1].length; i++) {
                        for (int j = 0; j < cinema[sala - 1][i].length; j++) {
                            System.out.print(cinema[sala - 1][i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("--------------------------------------- ");
                    continue;
                } else {
                    System.out.println("--------------------------------------- ");
                    System.out.println("Mapa de acento todas as salas");
                    for (int i = 0; i < cinema.length; i++) {
                        System.out.println("\nMapa de acento da Sala " + (i+1));
                        for (int j = 0; j < cinema[i].length; j++) {
                            for (int k = 0; k < cinema[i][j].length; k++){
                                System.out.print(cinema[i][j][k] + " ");
                            }
                            System.out.println();
                        }
                    }
                    System.out.println("--------------------------------------- ");
                    continue;
                }

                

            } else if (resposta.equalsIgnoreCase("R")) {
                System.out.println("------RESERVAR ACENTO-----");

                System.out.println("Mapa de acento todas as salas: ");
                
                System.out.println("--------------------------------------- ");
                System.out.println("Mapa de acento todas as salas");
                for (int i = 0; i < cinema.length; i++) {
                    System.out.println("\nMapa de acento da Sala " + (i+1));
                    for (int j = 0; j < cinema[i].length; j++) {
                        for (int k = 0; k < cinema[i][j].length; k++){
                            System.out.print(cinema[i][j][k] + " ");
                        }
                        System.out.println();
                    }
                }
                System.out.println("--------------------------------------- ");
                
                System.out.println("Qual sala você deseja reservar? (1, 2 ou 3)");
                int salaReserv = sc.nextInt();

                while (salaReserv != 1 && salaReserv != 2 && salaReserv != 3) {
                    System.out.println("Resposta inválida, por favor, digite 1, 2 ou 3");
                    salaReserv = sc.nextInt();
                }

                System.out.println("Qual Fileira você deseja reservar da sala " + salaReserv + " ? (1, 2, 3, 4, 5)");
                int fileiraReserv = sc.nextInt();

                while (fileiraReserv != 1 && fileiraReserv != 2 && fileiraReserv != 3 && fileiraReserv != 4 && fileiraReserv != 5) {
                    System.out.println("Resposta inválida, por favor, digite 1, 2, 3, 4 ou 5");
                    fileiraReserv = sc.nextInt();
                }

                System.out.println("Qual cadeira da fileira " + fileiraReserv + " você deseja reservar? (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)");
                int cadeiraReserv = sc.nextInt();

                while (cadeiraReserv != 1 && cadeiraReserv != 2 && cadeiraReserv != 3 && cadeiraReserv != 4 && cadeiraReserv != 5 && cadeiraReserv != 6 && cadeiraReserv != 7 && cadeiraReserv != 8 && cadeiraReserv != 9 && cadeiraReserv != 10) {
                    System.out.println("Resposta inválida, por favor, digite 1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10");
                    cadeiraReserv = sc.nextInt();
                }

                if (cinema[salaReserv - 1][fileiraReserv - 1][cadeiraReserv - 1] == 'L') {
                    cinema[salaReserv - 1][fileiraReserv - 1][cadeiraReserv - 1] = 'O';
                    System.out.println("Acento reservado com sucesso!");
                    continue;
                } else {
                    System.out.println("Não foi possível reservar este acento, pois já está reservado!");
                    continue;
                }
            } 
        }
        sc.close();
    }
}