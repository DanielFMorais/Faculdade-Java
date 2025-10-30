public class Gerente extends Funcionario {

    public Gerente (int id, String cpf, String nome) {
        super(id, cpf, nome, 3);
    }

    @Override
    public void imprimirCargo(){
        System.out.println("Gerente");
    }
}
