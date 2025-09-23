//Daniel Fernandes de Morais
// RA: 12126602
// 05/04/2025

import java.util.Scanner;

public class ativ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do seu salário: ");
        double valor = sc.nextDouble();

        if (valor < 500 ) {
            System.out.println("Você terá um ajuste de 15% do salário.") ;

            double reajuste = valor + (valor * 0.15) ;

            System.out.println("Você tera um novo salário de " + reajuste) ;

        }else if (valor >= 500 && valor <= 1000) {
            System.out.println("Você tera um ajuste de 10% do salário.") ;
            double reajuste = valor + (valor * 0.10) ;

            System.out.println("Você tera um novo salário de " + reajuste) ;
        }else {
            System.out.println("Você tera um ajuste de 5%.");
            double reajuste = valor + (valor * 0.05) ;

            System.out.println("Você tera um novo salário de " + reajuste);
        }

        sc.close();
    }
}
