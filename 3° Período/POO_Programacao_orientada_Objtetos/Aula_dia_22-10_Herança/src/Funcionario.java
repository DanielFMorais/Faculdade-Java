public class Funcionario {

    protected final double SALARIO_BASE = 1518.0; // Constante: Boa prática -> Nomear tudo em letra maiúscula
    protected int id;
    protected String cpf;
    protected String nome;
    protected double salario;

    public Funcionario (int id, String cpf, String nome, double multiplicador) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.salario = SALARIO_BASE * multiplicador;
    }

    public double getSalario() {
        return salario;
    }

}
