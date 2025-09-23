import java.util.Scanner;

public class QuestionLP09 {

    public static int somaNaturais(int valor,int soma){

        if (valor == 0){
            return soma;
        } else {
            soma += (valor-1);
            return somaNaturais(valor -1, soma);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor me informe um valor N para realizar este cálculo: ");
        int v = sc.nextInt();

        int resultado = somaNaturais(v, v);//sempre coloque o v nos dois retornos

        System.out.printf("O resultado da soma de 1 até %d é de: %d",v, resultado);

        sc.close();
    }
}
