//Author: Daniel Fernandes de Morais
//RA: 12126602
//Data? 14 de Jan de 2025

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------------");
        System.out.println("Vamos calcular a o aproveitamento da turma e alunos");
        System.out.println("---------------------------------------------------");

        int qtdAprovados = 0;
        int qtdReprovados = 0;
        float somaNotas = 0;

        for (int i = 1; i <= 10; i++){
            float notaTotal = 0;

            System.out.println("Por favor, me informe o nome do " + i + "° aluno");
            String nome = sc.next();

            for (int j = 1 ; j <= 3 ; j++){
                System.out.println("Por favor, digite a " + j + "° nota do " + nome);
                float nota = sc.nextFloat();

                notaTotal += nota;
            }

            System.out.println("A nota total do " + nome + " Foi de " + notaTotal + " Pontos");
            System.out.println("-------------------------------------------------");
            System.out.println();

            if (notaTotal >= 60){
                qtdAprovados++;
            } else {
                qtdReprovados++;
            }

            somaNotas += notaTotal;
        }

        float mediaClass = somaNotas / 10;

        System.out.println("A quantidade de alunos aprovados foi de " + qtdAprovados);
        System.out.println("A quantidade de alunos reprovados foi de " + qtdReprovados);
        System.out.println("A média de nota da turma foi de " + mediaClass);

        sc.close();
    }
}
