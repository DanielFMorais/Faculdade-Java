package questao10;

import java.util.Scanner;

public class questao10 {
    public static void main (String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Por favor me informe um número: ");
            int valor = leia.nextInt();

        int absolute = Math.abs(valor);

        System.out.println("O absoluto do seu valor = " + absolute);

        leia.close();
    }
}
