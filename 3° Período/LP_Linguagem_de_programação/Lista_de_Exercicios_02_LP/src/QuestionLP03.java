import java.util.Scanner;

public class QuestionLP03 {
    
    public static String palavraInvertida(String palavra, int i) {
        //Caso base de parada
        if (i == palavra.length()) {
            return ""; // retorna String vazia
        }
        return palavra.charAt(palavra.length() - 1 - i) + palavraInvertida(palavra, i + 1);
        //Realiza concatenação de char até o ponte onde o length da palavra tenha alcançado o ultimo patamar, fazendo multiplicar a ultima palavra com uma string vazia, retornando
        //a ultima palavra, que sera concatenada com a penultima e assim por diante.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor me informe uma palavra para inverter: ");
        String palavra = sc.nextLine();

        String invertida = palavraInvertida(palavra,0);

        System.out.println(invertida);

        sc.close();
    }
}
