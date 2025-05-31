//Author: Daniel Fernandes de Morais
//RA: 12126602
//Data: 18 de Jan de 2025

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorFinal = 0;
        String descricao;

        do{
            System.out.println("Por favor, me informe a descrição do produto desejado: ");
            System.out.println("Caso queira finalizar, digite [FIM]");
            descricao = sc.nextLine();

            if (descricao.equalsIgnoreCase("FIM")){
                break;
            }

            System.out.println("Agora por favor, me informe o preço unitário do produto: ");
            double precoProduto = sc.nextDouble();

            System.out.println("Qual a quantidade deste produto o senhor deseja? ");
            int quantidade = sc.nextInt();
            sc.nextLine();

            valorFinal += (precoProduto * quantidade);


        } while (true);

        System.out.println("O valor final da sua conta for de: R$ " + valorFinal);

        sc.close();
    }
}
