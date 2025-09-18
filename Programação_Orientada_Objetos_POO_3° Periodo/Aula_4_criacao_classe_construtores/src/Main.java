public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Daniel", 22);

        System.out.println("NOME: " + pessoa.getNome());
        System.out.println("IDADE: " + pessoa.getIdade());

        pessoa.fazerAniversario();

        System.out.println("IDADE NOVA APÓS ANIVERSÁRIOS: " + pessoa.getIdade());
    }
}
