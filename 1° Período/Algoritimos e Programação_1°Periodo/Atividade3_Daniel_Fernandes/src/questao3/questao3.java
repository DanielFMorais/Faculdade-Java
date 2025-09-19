package questao3;

import java.util.Scanner;

public class questao3 {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);

        String valor1;

        System.out.println("Por favor, diga alguma coisa: ");

        valor1 = leia.nextLine();

        System.out.println ("A mensagem digitada foi: " + valor1);

        leia.close();
    }
}
