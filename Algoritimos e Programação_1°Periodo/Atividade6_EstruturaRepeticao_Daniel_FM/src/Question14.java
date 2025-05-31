//Author: Daniel Fernandes de Morais
//RA: 12126602
//Data: 18 de Jan de 2025

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0, aprovados = 0, reprovados = 0;
        double notaFinalSala = 0.0;
        String [] nomeAlunos = new String [100];
        boolean [] aprovacaoAlunos = new boolean [100];


        do {
            double notaTotal = 0;

            System.out.println("Qual o nome do " + (contador + 1) + "°  aluno: ");
            System.out.println("Para sair digite [FIM]");
            String nome = sc.nextLine();

            if (nome.equalsIgnoreCase("FIM")){
                break;
            }


            nomeAlunos[contador] = nome;

            for (int i = 0; i < 3; i++){
                System.out.println("Me informe a " + (i + 1) + "° nota do " + nome + ": ");
                double nota = sc.nextDouble();
                notaTotal += nota;
            }
            sc.nextLine();

            if (notaTotal >= 60){
                aprovacaoAlunos[contador] = true;
                aprovados++;
            } else {
                aprovacaoAlunos[contador] = false;
                reprovados++;
            }

            notaFinalSala += notaTotal;

            contador++;

        } while (true);

        System.out.println("====================================");
        System.out.println("            RESULTADOS");
        System.out.println("====================================");

        System.out.println("A média da turma foi de: " + (notaFinalSala / contador) + "\n");
        System.out.println("A quantidades de alunos da turma que foram APROVADOS é de: " + aprovados + "\n");
        System.out.println("A quantidade de alunos da turma que foram REPROVADOS é de: " + reprovados + "\n");
        System.out.println("====================================");

        System.out.println("----------------------");
        System.out.println("Status Alunos da turma");
        System.out.println("----------------------");

        for (int i = 0; i < contador; i++){
            System.out.println("Nome Aluno: " + nomeAlunos[i]);
            if (aprovacaoAlunos[i]){
                System.out.println("Status: APROVADO");
            }else {
                System.out.println("Status: REPROVADO");
            }
            System.out.println("_____________________");
        }


        sc.close();

    }
}
