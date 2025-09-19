//Daniel Fernandes de Morais
// RA: 12126602
// 31/03/2025

import java.util.Scanner;

public class Ativ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a nota da primeira prova: ");
        double nota = sc.nextDouble();
        System.out.println("Qual a nota da segunda prova: ");
        double nota2 = sc.nextDouble();
        System.out.println("Qual a nota da terceira prova: ");
        double nota3 = sc.nextDouble();

        double media = (nota + nota2 + nota3) / 3;

        System.out.printf("A média da nota do aluno é de %.2f", media);

        if (media >=0 && media < 3){
            System.out.println("O aluno foi reprovado!!");
        }else if (media >= 3 && media < 7){
            System.out.println("O aluno  esta de RECUPERAÇÃO");
            System.out.println("Para aprovação nesta etapa, o aluno necessita tirar uma média de 6");
        }else if (media >= 7 && media <= 10){
            System.out.println("O aluno foi APROVADO!!");
        }

        sc.close();
    }
}
