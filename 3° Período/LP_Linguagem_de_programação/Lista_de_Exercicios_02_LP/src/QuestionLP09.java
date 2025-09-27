import java.util.Scanner;

public class QuestionLP09 {

    public static int somaNaturais(int valor){

        if (valor == 0){
            return valor; // caso base
        }
        return valor + somaNaturais(valor -1); // Fará a soma sempre com um valor a menos que o original que chegue a zero e retorne o caso base
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor me informe um valor N para realizar este cálculo: ");
        int v = sc.nextInt();

        int resultado = somaNaturais(v);

        System.out.printf("O resultado da soma de 1 até %d é de: %d",v, resultado);

        sc.close();
    }
}
