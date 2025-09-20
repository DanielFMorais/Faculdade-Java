

public class _Main {
    public static void main(String[] args) throws Exception {

        
        // Criando dois objetos da classe Pessoa
        Pessoa p1 = new Pessoa("João Silva", "99999-1111", "joao@email.com");
        Pessoa p2 = new Pessoa("Maria Oliveira", "98888-2222", "maria@email.com");

        // Imprimindo os dados originais
        System.out.println("Dados Originais:");
        p1.imprimirDados();
        p2.imprimirDados();

        // Alterando valores
        p1.setTelefone("97777-3333");
        p2.setEmail("maria.oliveira@email.com");

        // Imprimindo os dados após alteração
        System.out.println("Dados Após Alteração:");
        p1.imprimirDados();
        p2.imprimirDados();

    }
}
