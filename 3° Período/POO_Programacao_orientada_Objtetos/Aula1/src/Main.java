import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Informe a conta:"));
        String nome = JOptionPane.showInputDialog("Informe o Nome:");
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo Incial"));

        ContaBancaria conta = new ContaBancaria(numeroConta,nome,saldo);
        conta.mostrarSaldo();
        double valorAdicao = Double.parseDouble(JOptionPane.showInputDialog("Me informe quanto deseja adicionar"));

        conta.realizarDeposito(valorAdicao);
        conta.mostrarSaldo();

        double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Por favor, me informe quanto que deseja sacar: "));
        conta.realizarSaque(valorSaque);
        conta.mostrarSaldo();
    }
}
