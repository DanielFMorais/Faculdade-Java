import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContaBancaria {
    private int numero; //numero da conta
    private String titular; //nome do titular da conta
    private double saldo; //salda atual da conta

    public ContaBancaria (String titular, int numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositarDinheiro (double deposito) {

        System.out.printf("Saldo Anterior da conta %d ao depósito: R$ %.2f \n", numero, saldo);
        System.out.printf("Valor deposistado: R$ %.2f \n", deposito);
        saldo += deposito;
        System.out.printf("Saldo Atual da conta %d: R$ %.2f \n",numero, saldo);
    }

    public void sacarDinheiro (double saque) {

        System.out.printf("Saldo Anterior da conta %d ao saque: R$ %.2f \n", numero, saldo);
        System.out.printf("Valor de saque: R$ %.2f \n", saque);
        saldo -= saque;
        System.out.printf("Saldo Atual da conta %d: R$ %.2f \n",numero, saldo);
    }

    public void exibirSaldo () {

        System.out.printf("O saldo atual da conta %d é de: R$ %.2f \n",numero, saldo);
    
    }


    public void nomeCartao () {

        List<String> preposicoesProibidas = List.of("de", "da", "das", "do", "dos", "e");
        String[] partesNome = titular.split(" ");
        List<String> partesNomeList = new ArrayList<>(Arrays.asList(partesNome));
        partesNomeList.removeIf(parte -> preposicoesProibidas.contains(parte.toLowerCase()));
        String[] nomeUtilizado = partesNomeList.toArray(new String[0]);


        for (int i = 0; i < nomeUtilizado.length; i++) {
            nomeUtilizado[i] = nomeUtilizado[i].toUpperCase();
        }

        String[] nomeCartao = new String[nomeUtilizado.length];

        for (int i = 0; i < nomeCartao.length; i++){
            if (i == 0){
                nomeCartao[i] = nomeUtilizado[i];
            } else if (i == (nomeUtilizado.length - 1)){
                nomeCartao[i] = nomeUtilizado[i];
            } else {
                nomeCartao[i] = (nomeUtilizado[i].charAt(0) + ".");
            }
        }

        System.out.printf("O nome que será impresso no cartão será da conta %d: ", numero);
        for (int i = 0; i < nomeCartao.length; i++){
            System.out.print(nomeCartao[i] + " ");
        }
    }
}
