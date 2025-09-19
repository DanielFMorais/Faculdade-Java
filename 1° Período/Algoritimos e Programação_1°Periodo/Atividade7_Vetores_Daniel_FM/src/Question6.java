/*
Nome: Daniel Fernandes de Morais
RA: 12126602
Data 24/05/2025

 */

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valores [] = new int[]{10,12,124,172,11,6,54,23,91,74,192,14,19,44,22};

        while (true){
            System.out.println("Por favor me informe um valor: ");
            System.out.println("(Se quiser sair digite 0)");
            int valor = sc.nextInt();

            if (valor == 0){
                break;
            }

            boolean prsente = false;

            for (int i = 0; i < valores.length; i++) {
                if (valor == valores[i]) {
                    System.out.println("\nEste valor esta presente no nosso ARRAY");
                    System.out.println("O número encontra-se no índice " + i);
                    System.out.println("------------------------------------------");
                    prsente = true;
                    break;
                }
            }

            if (prsente!= false) {
                System.out.println("\nEste valor NÃO esta presente no nosso ARRAY");
                System.out.println("------------------------------------------");
            }
        }

        sc.close();
    }
}
