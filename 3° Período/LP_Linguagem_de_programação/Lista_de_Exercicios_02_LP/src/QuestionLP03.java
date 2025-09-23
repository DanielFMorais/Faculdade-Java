import java.util.Scanner;

public class QuestionLP03 {

    public static String palavraInvertida(String palavra){

        if (palavra.length() == 1){
            return palavra;
        } else {
            char pLetra = palavra.charAt(0);
            String restoPalavra = palavra.substring(1);
            return palavraInvertida(restoPalavra) + pLetra;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor me informe uma palavra para inverter: ");
        String palavra = sc.nextLine();

        String invertida = palavraInvertida(palavra);

        System.out.println(invertida);

        sc.close();
    }
}
