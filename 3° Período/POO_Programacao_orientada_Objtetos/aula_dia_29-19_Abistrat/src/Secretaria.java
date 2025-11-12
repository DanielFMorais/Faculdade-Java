public class Secretaria extends Funcionario {

    public Secretaria(int id, String cpf, String nome) {
        super(id, cpf, nome,2);
    }

    @Override
    public void imprimirCargo(){
        System.out.println("Secretária");
    }
}
