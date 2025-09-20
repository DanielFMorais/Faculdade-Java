import java.util.Scanner;

public class _Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        char continuar = 'S';
        //DADOS DA CONTA 
        System.out.println("Por favor me informe o nome completo do usuário da conta:");
        String nome = sc.nextLine();
        System.out.println("======================");
        System.out.println("Agora por favor, me informe o numero da conta");
        int conta = sc.nextInt();

        ContaBancaria cont = new ContaBancaria(nome, conta, 1000);
        
        
        while (continuar == 'S') {
            System.out.println("======================");
            System.out.println("Me informe o que você gostaria de consultar ou fazer na sua conta: ");
            System.out.println("1 -> Verificar saldo \n2 -> Depositar dinheiro \n3 -> Sacar dinheiro \n4 -> Segunda via do cartão");
            int num = sc.nextInt();
            
            if (num == 1){
                cont.exibirSaldo();
            }else if (num == 2) {
                System.out.println("Por favor, me informe o valor que quer depositar");
                double deposito = sc.nextDouble();
                cont.depositarDinheiro(deposito);
            }else if (num == 3) {
                System.out.println("Por favor, me informe o valor que deseja sacar");
                double sacar = sc.nextDouble();
                cont.sacarDinheiro(sacar);
            } else if (num == 4) {
                System.out.println("Segunda via do cartão em processamento... \n ... \n ...\n");
                cont.nomeCartao();
            } else {
                System.out.println("NENHUMA OPÇÃO VALIDA, POR FAVOR, TENTE NOVAMENTE UMA OPÇÃO VALIDA!!");
            }
        
            System.out.println();
            System.out.println("Deseja fazer mais algo? (Digite S para CONTINUAR ou qulquer outro caractere para SAIR)");
            continuar = Character.toUpperCase(sc.next().charAt(0));
        }

        sc.close();
    }
}
