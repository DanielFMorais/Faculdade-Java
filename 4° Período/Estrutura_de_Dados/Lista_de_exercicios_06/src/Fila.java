public class Fila {
    private Nodo inicio;
    private Nodo fim;
    private int quantidade;

    /* ----------- Métodos auxiliares */

    private boolean vazia() {
        return inicio == null;
    }

    //MÉTODOS DE AÇÃO--------------------------------------------------------------------------------------------------
    //=================================================================================================================

    /* Criação da Fila vazia */
    public Fila() {
        this.inicio = null;
        this.fim = null;
        this.quantidade = 0;
    }

    /* Para adicionar um valor na Fila */
    public void inserir(int valor) {
        Nodo novo = new Nodo(valor);

        if (vazia()) {
            inicio = novo;
            fim = novo;

            quantidade++;
            System.out.println("==ADICIONADO==");
            return;
        }

        fim.setProximo(novo);
        fim = novo;

        quantidade++;
        System.out.println("==ADICIONADO==");
    }

    /* Para remover um valor da Fila */
    public void remover() {
        if (vazia()) {
            System.out.println("Sua Fila esta vazia! Muito Obrigado");
            return;
        }

        int valor = inicio.getValor();

        inicio = inicio.getProximo();

        if (inicio == null) {
            fim = null;
        }

        quantidade--;

        System.out.printf("==REMOVIDO [%d]==\n", valor);
    }

    /* Para exibir toda a Fila */
    public void exibir() {
        if (vazia()) {
            System.out.println("Sua Fila esta vazia, não tem o que exibir.");
            return;
        }

        System.out.print("[ ");

        Nodo atual = inicio;

        while (atual != null) {
            System.out.print(atual.getValor() + " ");
            atual = atual.getProximo();
        }

        System.out.println("]");
    }

    /* Para retornar a quantidade de itens na Fila */
    public void tamanho() {
        System.out.printf("A fila tem %d elementos\n", quantidade);
    }

    /* Para verificar se um valor existe na Fila */
    public void contem(int valor) {

        if (vazia()) {
            System.out.println("Sua Fila esta vazia.");
            return;
        }

        Nodo atual = inicio;

        while (atual != null) {

            if (atual.getValor() == valor) {
                System.out.printf("O valor [%d] foi encontrado na fila.\n", valor);
                return;
            }

            atual = atual.getProximo();
        }

        System.out.printf("O valor [%d] nao foi encontrado na fila.\n", valor);
    }
}