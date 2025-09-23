import java.util.Scanner;

public class QuestionLP10 {
    
    public static String valorBinario (int valor){
        if (valor == 0){
            return "";
        }else {
            return valorBinario(valor/2) + (valor % 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor me informe o valor decimal que deseja transformar em base binária: ");
        int valor = sc.nextInt();

        String binaria = valorBinario(valor);

        System.out.printf("O valor binario referente a %d é: %s",valor,binaria);

        sc.close();
    }

}
