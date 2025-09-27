import java.util.Scanner;

public class QuestionLP01 {

    public int n;

    public static int somaDigitos (int n){
        
        if (n < 10 && n > -10){
            return n;
            //Retorna o primeiro digito
        } else {
            return (n % 10 ) + somaDigitos(n / 10);
            //(num % 10) = o ultimo digito do número 
            //(num / 10) = o número sem o último digioto e chama a função novamente
        } 
        //Tem a funcionalidade de retornar a soma dos dígitos de um numero inteiro
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor digite um valor inteiro");
        int valor = sc.nextInt();

        System.out.println("A soma de cada digito é de: ");
        
        int soma = somaDigitos(valor);

        System.out.println(soma);

        sc.close();
    }
}
