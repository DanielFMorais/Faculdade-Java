import java.util.Scanner;

public class QuestionLP06 {

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

        System.out.println("Por favor me informe uma palavra para verificar: ");
        String palavra = sc.nextLine();

        String invertida = palavraInvertida(palavra);

        if (palavra.toUpperCase().equals(invertida.toUpperCase())){
            System.out.println("É UM PALINDROMO");
        }else {
            System.out.println("NÃO É UM PALINDROMO");
        }

        sc.close();
    }

}
