//Daniel Fernandes de Morais
// RA: 12126602
// 31/03/2025

import java.util.Scanner;

public class ativ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("___________________________________________________________________________________________________");
        System.out.println("    REGRAS");
        System.out.println("Digite o primeiro valor, o segundo valor será maior que o primeiro e o terceiro maior que o segundo");
        System.out.println("___________________________________________________________________________________________________");

//        int valor1, valor2, valor3, valor4;

        System.out.print("Digite um valor: ");
        int valor1 = sc.nextInt();

        System.out.print("Digite o Segundo valor: ");
        int valor2 = sc.nextInt();

        int valor3 = 0;
        int valor4 = 0;


        if (valor2 > valor1) {
            System.out.print("Digite o Terceiro valor: ");
            valor3 = sc.nextInt();

            if (valor3 > valor2) {
                System.out.print("Digite o quarto valor: ");
                valor4 = sc.nextInt();

            } else {
                System.out.println("O terceiro valor é menor ou igual o segundo. ");
            }
        } else {
            System.out.println("Valor menor ou igual o primeiro valor. ");
        }

        if (valor4 > valor3){
            System.out.print(valor4 + " " + valor3 + " " + valor2 + " " + valor1) ;
        }
        else if (valor4 > valor2){
            System.out.print(valor3 + " " + valor4 + " " + valor2 + " " + valor1) ;
        }
        else if ( valor4 > valor1){
            System.out.print(valor3 + " " + valor2 + " " + valor4 + " " + valor1) ;
        }
        else{
            System.out.print(valor3 + " " + valor2 + " " + valor1 + " " + valor4) ;
        }


        sc.close();
        
    }
}
