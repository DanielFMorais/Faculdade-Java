//Daniel Fernandes de Morais
// RA: 12126602
// 05/04/2025

import java.util.Scanner;

public class ativ17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, me informe o valor do seu salário:   ");
        double salario = sc.nextDouble();

        double desconto = 0;

        if (salario <= 1100) {
             desconto = salario * 0.075;
        } else if (salario >= 1100.01 && salario <= 2203.48) {
             desconto = salario * 0.09;
        } else if (salario >= 2203.49 && salario <= 3305.22) {
             desconto = salario * 0.12;
        } else if (salario >= 3305.23 && salario <= 6433.27) {
             desconto = salario * 0.14;
        } else {
             desconto = 6433.57 * 0.14;
        }

        double salarioDesconto = salario - desconto;

        System.out.println("Com seu salario de: " + salario + " O seu desconto é de " + desconto);
        System.out.println("Isso faz com que seu salário com o desconto do INSS seja: " + salarioDesconto);


        sc.close();
    }
}
