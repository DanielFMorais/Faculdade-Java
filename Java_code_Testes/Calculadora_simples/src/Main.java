import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        Boolean decisao = true;
        
        while (decisao == true){

            System.out.println("--------------------------------------------------------");
            System.out.println("Por favor, me informe que tipod e calculo deseja fazer? ");
            System.out.println("Opção 1 = Adição (+)");
            System.out.println("Opção 2 = Subtração (-)");
            System.out.println("Opção 3 = Multiplicação (*)");
            System.out.println("Opção 4 = Divisão (/)");
            System.out.println("Opção 5 = Potencialização (^)");
            System.out.println("Opção 6 = Resto da divisão (%)");
            System.out.println("--------------------------------------------------------");
    
            int valor = sc.nextInt();
            
            while (valor != 1 && valor != 2 && valor != 3 && valor != 4 && valor != 5 && valor != 6) {
                System.out.println("O valor inserido é invalido, por favor tente novamente");
                valor = sc.nextInt();    
            }
    
            System.out.println("======");
            if (valor == 1) {
                System.out.println("Tipo selecionado: ADIÇÃO");
            } else if (valor == 2){
                System.out.println("Tipo selecionado: SUBTRAÇÃO");
            } else if (valor == 3){
                System.out.println("Tipo selecionado: MULTIPLICAÇÃO");
            } else if (valor == 4) {
                System.out.println("Tipo selecionado: DIVISÃO");
            } else if (valor == 5) {
                System.out.println("Tipo selecionado: POTENCIALIZAÇÃO");
            } else {
                System.out.println("Tipo selecionado: RESTO DA DIVISÃO");
            }
            System.out.println("======");
    
    
            System.out.println("\nAgora por favor, me diga o primeiro valor: ");
            double valor1 = sc.nextDouble();
    
            System.out.println("\nAgora me diga o segundo valor: ");
            double valor2 = sc.nextDouble();
            sc.nextLine();
    
            while (valor2 == 0 && (valor == 3 || valor == 5)) {
                System.out.println("O segundo valor não pode ser 0, por favor insira um novo valor!");
                valor2 = sc.nextDouble();
                sc.nextLine();
            }
    
            double resultado = 0;
            char sinal = ' ';
    
            switch (valor) {
                case 1:
                    resultado = valor1 + valor2;        
                    sinal = '+';
                    break;
                case 2:
                    resultado = valor1 - valor2;
                    sinal = '-';
                    break;
                case 3: 
                    resultado = valor1 * valor2; 
                    sinal = '*';
                    break;
                case 4: 
                    resultado = valor1 / valor2;
                    sinal = '/';
                    break;
                case 5:
                    resultado = Math.pow(valor1, valor2);
                    sinal = '^';
                    break;
                case 6:
                    resultado = valor1 % valor2;
                    sinal = '%';
                    break;
            }
        
            System.out.println("---------------------------------------------------------");
            System.out.println("\n===Calculadora em Java===");
            System.out.printf("O resultado de %.2f %c %.2f = %.2f\n", valor1,sinal,valor2,resultado);

            System.out.println("\n========================================================");

            System.out.println("Deseja realizar mais calculos: [S/N]");
            String resposta = sc.nextLine();
            
            while (!resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n")) {
                System.out.println("Resposta inválida, Digite [s] para SIM e [n] para NÂO");
                resposta = sc.nextLine();
            }
            
            if (resposta.equalsIgnoreCase("n")){
                decisao = false;
            }
        }
        sc.close();
    }
}
