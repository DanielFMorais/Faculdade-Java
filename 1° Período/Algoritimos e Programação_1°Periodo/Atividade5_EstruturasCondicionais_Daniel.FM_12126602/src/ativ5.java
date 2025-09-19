//Daniel Fernandes de Morais
// RA: 12126602
// 31/03/2025

import java.util.Scanner;

public class ativ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();

        String senhaof = "4531";

        if (senha.equals(senhaof)) {
            System.out.println("Senha correta!");
            System.out.println("ACESSO LIBERADO");
        } else {
            System.out.println("Senha incorreta!");
            System.out.println("ACESSO NEGADO");
            System.exit(0);
        }

        sc.close();
    }
}
