package questao8;

import java.util.Scanner;

public class questao8 {
    public static void main(String[] args){
        Scanner leia = new Scanner (System.in);

        String algo;
        int valor1;

        System.out.println("Digita algo (string)");
        algo = leia.nextLine();

        System.out.println("Digite um valor: ");
        valor1 = leia.nextInt();

        System.out.println("O junção dos dois dá: " + (algo + valor1));
        System.out.println("Você falou a string '" + algo + "' e digitou o número '" + valor1 + "'");


    }
}
