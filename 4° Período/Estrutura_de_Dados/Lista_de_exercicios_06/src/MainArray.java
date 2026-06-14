import java.util.InputMismatchException;
import java.util.Scanner;

public class MainArray {

    public static int lerInteiro(Scanner sc, String mensagem) {

        while (true) {

            System.out.print(mensagem);

            try {

                int valor = sc.nextInt();
                sc.nextLine();

                return valor;

            } catch (InputMismatchException e) {

                System.out.println(
                    "Valor digitado INVÁLIDO! Tente Novamente..."
                );

                sc.nextLine();
            }
        }
    }

    public static void main(String[] args) {

        ArrayFila fila = new ArrayFila(5);

        Scanner sc = new Scanner(System.in);

        do {
            System.out.printf("""
            ----------
            FILA POR ARRAY

            [1] INSERIR elemento
            [2] REMOVER elemento
            [3] EXIBIR quantidade
            [4] EXIBIR fila
            [5] PESQUISAR valor

            [DIGITE QUALQUER LETRA PARA SAIR]
            """);

            int op = -1;

            try {

                op = sc.nextInt();
                sc.nextLine();

            } catch (Exception e) {

                System.out.println(
                    "Obrigado por usar nosso programa! ATE MAIS!"
                );

                sc.nextLine();
                break;
            }

            if (op == 1) {

                int a = lerInteiro(
                    sc,
                    "Qual valor você gostaria de adicionar na fila: "
                );

                fila.inserir(a);

            } else if (op == 2) {

                fila.remover();

            } else if (op == 3) {

                fila.tamanho();

            } else if (op == 4) {

                fila.exibir();

            } else if (op == 5) {

                int a = lerInteiro(
                    sc,
                    "Qual valor você gostaria de pesquisar: "
                );

                fila.contem(a);
            }

        } while (true);

        sc.close();
    }
}