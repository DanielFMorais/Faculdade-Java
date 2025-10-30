/* Criar 3 classses: Funcionário, Gerente e Secretaria

 * Funcionário será a Superclasse e terá o atributo salarioBase = 1518
 * Gerente será subclasse de Funcionário e receberá 3 salarioBase
 * Secretária também será subclassse, mas receberá 2 salariosBase */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Gerente gerente1 = new Gerente (1, "11111111111", "Arthur");

        Estagiario estagiario = new Estagiario(2, "22222222222", "Rebeca");

        Secretaria secretaria = new Secretaria(3, "33333333333","Joana");


        ArrayList<Funcionario> funcionarios = new ArrayList<>(); // Polimorfismo
        funcionarios.add(gerente1);
        funcionarios.add(secretaria);
        funcionarios.add(estagiario);
        
        double salarioTotal = 0.0;

        for(Funcionario f: funcionarios){
            System.out.println(f.nome);
            f.imprimirCargo();
            System.out.println();
            salarioTotal += f.getSalario();
        }

        System.out.println("\nSoma dos salários: " + salarioTotal);
        System.out.println();

    }
}
