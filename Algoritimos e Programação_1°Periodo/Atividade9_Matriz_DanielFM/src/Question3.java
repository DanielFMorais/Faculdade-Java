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
            System.out.println("\nPara visualizar o mapa de acento digite 'A' e para reservar um acento digite 'R'");
            System.out.println("Ou digite 'S' para sair do programa");
            resposta = sc.next();
            
            while (!resposta.equalsIgnoreCase("a") && !resposta.equalsIgnoreCase("r") && !resposta.equalsIgnoreCase("s")) {
                System.out.println("\nResposta invárlida, por favor, digite 'A' ou 'R' ou 'S'");
                resposta = sc.next();
            }

            
            if (resposta.equalsIgnoreCase("A")){
                
                System.out.println("Qual sala você deseja visualizar? (1, 2 ou 3)");
                int sala = sc.nextInt();
                
                while (sala != 1 && sala != 2 && sala != 3) {
                    System.out.println("Resposta inválida, por favor, digite 1, 2 ou 3");
                    sala = sc.nextInt();
                }
                
                if (sala == 1) {
                    System.out.println("--------------------------------------- ");
                    System.out.println("Mapa de acento da sala 1:");
                    for (int i = 0; i < cinema[0].length; i++) {
                        for (int j = 0; j < cinema[0][i].length; j++) {
                            System.out.print(cinema[0][i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("--------------------------------------- ");
                }else if (sala == 2){
                    System.out.println("--------------------------------------- ");
                    System.out.println("Mapa de acento da sala 2:");
                    for (int i = 0; i < cinema[0].length; i++) {
                        for (int j = 0; j < cinema[1][i].length; j++) {
                            System.out.print(cinema[1][i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("--------------------------------------- ");
                }else{
                    System.out.println("--------------------------------------- ");
                    System.out.println("Mapa de acento da sala 3:");
                    for (int i = 0; i < cinema[0].length; i++) {
                        for (int j = 0; j < cinema[2][i].length; j++) {
                            System.out.print(cinema[2][i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("--------------------------------------- ");
                }
                
                continue;
            } else if (resposta.equalsIgnoreCase("R")) {
                System.out.println("------RESERVAR ACENTO-----");

                System.out.println("Qual sala você deseja reservar? (1, 2 ou 3)");
                int salaReserv = sc.nextInt();

                while (salaReserv != 1 && salaReserv != 2 && salaReserv != 3) {
                    System.out.println("Resposta inválida, por favor, digite 1, 2 ou 3");
                    salaReserv = sc.nextInt();
                }

                if (salaReserv == 1) {
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

                    if (cinema[0][fileiraReserv - 1][cadeiraReserv - 1] == 'L') {
                        cinema[0][fileiraReserv - 1][cadeiraReserv - 1] = 'O';
                        System.out.println("Acento reservado com sucesso!");
                        continue;
                    } else {
                        System.out.println("Não foi possível reservar este acento, pois já está reservado!");
                        continue;
                    }

                } else if (salaReserv == 2) {
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

                    if (cinema[1][fileiraReserv - 1][cadeiraReserv - 1] == 'L') {
                        cinema[1][fileiraReserv - 1][cadeiraReserv - 1] = 'O';
                        System.out.println("Acento reservado com sucesso!");
                        continue;
                    } else {
                        System.out.println("Não foi possível reservar este acento, pois já está reservado!");
                        continue;
                    }
                } else {
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

                    if (cinema[2][fileiraReserv - 1][cadeiraReserv - 1] == 'L') {
                        cinema[2][fileiraReserv - 1][cadeiraReserv - 1] = 'O';
                        System.out.println("Acento reservado com sucesso!");
                        continue;
                    } else {
                        System.out.println("Não foi possível reservar este acento, pois já está reservado!");
                        continue;
                    }
                }
                
            } 
        }
        sc.close();
    }
}