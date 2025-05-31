/*
Nome: Daniel Fernandes de Morais
RA: 12126602
Data: 30 de Maio de 2025
 */


public class Question10 {
    public static void main(String[] args) {

        String vetorString [] = {"Daniel", "Dayene", "Luiz", "Maria", "Patrick", "Vinicius", "Daniel"};
        String busca = "Daniel";
        int contador = 0;

        for (int i = 0; i < vetorString.length; i++) {
            if (vetorString[i].equalsIgnoreCase(busca)) {
                contador++;
            }
        }

        System.out.println("A palavra 'Daniel' apareceu " + contador + " vezes" );

    }
}
