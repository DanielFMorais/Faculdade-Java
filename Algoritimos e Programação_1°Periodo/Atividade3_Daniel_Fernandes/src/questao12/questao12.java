package questao12;

import java.util.Scanner;

public class questao12 {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digita alguma palavra ");
        String algo = leia.nextLine();

        System.out.println("Digite um valor: ");
        int valor1 = leia.nextInt();

        System.out.println("Você falou a string '" + algo + "' e digitou o número '" + valor1 + "'");
    }
}
