import javax.swing.*;

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria (int numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public void mostrarSaldo() {
        JOptionPane.showMessageDialog(null,"Titular: "+nomeTitular+"\n"+"Conta: "+numeroConta+"\nSaldo: R$ "+saldo);
    }

    public void realizarDeposito (double adicao) {
        saldo += adicao;
    }

    public void realizarSaque (double saque) {
        if (saque <= saldo) {
            saldo -= saque;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }
    }

}



