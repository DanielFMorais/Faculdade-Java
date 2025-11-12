public class Estagiario extends Funcionario{
    
    public Estagiario(int id, String cpf, String nome) {
        super(id, cpf, nome,1);
    }

    @Override
    public void imprimirCargo(){
        System.out.println("Estagiário");
    }
}
