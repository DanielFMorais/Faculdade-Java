import java.util.Scanner;

public class QuestionLP06 {

    public static boolean palindromo(String palavra, int i){
        if (i == palavra.length()){
            return true;
        }
        if (palavra.toUpperCase().charAt(i) != (palavra.toUpperCase().charAt(palavra.length() - i -1 ))){
            return false;
        } 
        return palindromo(palavra, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor me informe uma palavra para verificar: ");
        String palavra = sc.nextLine();

        boolean invertida = palindromo(palavra,0);

        
        System.out.printf("A palavra %s é um Palindromo? %b", palavra, invertida);
        
        sc.close();
    }

}
