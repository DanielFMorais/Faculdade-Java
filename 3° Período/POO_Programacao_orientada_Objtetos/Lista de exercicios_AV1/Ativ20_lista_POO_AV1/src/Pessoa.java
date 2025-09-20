public class Pessoa {
    private String nome; 
    private int telefone; 
    private String email;

    public Pessoa (String nome, int telefone, String email){
        
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;

    }

    public void alterarValores(String nome, int telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;

        System.out.println("Seus novos dados são: ");
    }

    public void mostrarValores(){
        System.out.println("\nSeus dados são:");
        System.out.println("Nome = " + nome);
        System.out.println("Telefone = " + telefone);
        System.out.println("Email = " + email);
    }

}
