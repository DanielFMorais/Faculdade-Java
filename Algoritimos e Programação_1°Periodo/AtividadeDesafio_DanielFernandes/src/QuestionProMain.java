/*
 * Nome: Daniel Fernandes de Morais
 * RA: 12126602
 * Data Início: 31 de Maio de 2025
 * Data Término: -- de Maior de 2025
 */

import java.util.Random;
import java.util.Scanner;

public class QuestionProMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        double consumoMedio [] = new double[20]; // Reais
        String nomeClientes [] = new String[consumoMedio.length];
        int codigoCliente [] = new int[consumoMedio.length];
        double valorConta [] = new double[20];


        System.out.println("Inicialmente, qual a tarifa dos Kw");
        double tarifaKW = sc.nextDouble();

        for (int i = 0; i < consumoMedio.length; i++){

            System.out.println("Qual o nome do " + (1 + i ) + "° Cliente");
            nomeClientes[i] = sc.nextLine();

            codigoCliente[i] = random.nextInt(1, 5);

            System.out.println("Qual o valor da média de consumo (Kw) dos últimos 12 meses de cada cliente?");
            consumoMedio[i] = sc.nextDouble();
            
            valorConta[i] = (consumoMedio[i] * tarifaKW);

            System.out.println("Teste");
        }
        
        sc.close();
    }

    
}
