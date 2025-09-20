import java.util.Scanner;

public class _Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Por favor me informe o nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Por favor me informe o Telefone sem DDD(9XXXXXXXX): ");
        int telefone = sc.nextInt();
        sc.nextLine();

        System.out.print("Por favor me informe o Email: ");
        String email = sc.nextLine();
        
        Pessoa p = new Pessoa (nome, telefone, email);

        p.mostrarValores();

        System.out.println("Quer alterar estes dados? (s/n)");
        char resposta = Character.toUpperCase(sc.next().charAt(0));
        sc.nextLine();

        if (resposta == 'S' ){
            System.out.print("Por favor me informe o nome: ");
            nome = sc.nextLine();
        
            System.out.print("Por favor me informe o Telefone sem DDD(9XXXXXXXX): ");
            telefone = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Por favor me informe o Email: ");
            email = sc.nextLine();

            p.alterarValores(nome, telefone, email);
            p.mostrarValores();
        }else{
            System.out.println("MUITO OBRIGADO!");
        }


        sc.close();

    }
}
