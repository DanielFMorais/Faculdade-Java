import java.util.Scanner;

public class QuestionLP02 {

    public static double potencialização (double base, double expoente) {
        if (expoente == 0){
            return 1.00; // Retorna 1 pois a multiplicação da base x 1 == a propria base
        }
        return base * (potencialização(base, expoente - 1)); //Retorna a recursão até que o expoente retorne o caso base, e volte realizando a multiplicação
        //A multiplicação com a recursão basicamente faz com que o exepoente fique diminuindo até que chegue no valor do caso bse, fazendo com que 
        //o código posteriormente faca as multiplicações somente entre as bases, já que o ultimo valor sendo 1, qualquer numero multiplicado por ele é igual a ele mesmo
        //fazendo que o resultado do retorno seja a base, que sera multiplicada por outra base.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor me informe a Base da potencialização: ");
        double base = sc.nextDouble();

        System.out.print("Agora por favor, me informe o expoente da potencialização: ");
        double expoente = sc.nextDouble();

        double resultado = potencialização(base, expoente);

        System.out.printf("O resutado da potencialização de %.1f ^ %.1f = %.2f", base, expoente, resultado);

        sc.close();
    }

}
