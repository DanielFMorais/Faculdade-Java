/*
 * Nome: Daniel Fernandes de Morais
 * RA: 12126602
 * Data: 15/06/2025
 */


public class Question4 {
    public static void main(String[] args) {

        double[][] clima = {
            {17.8, 18.2, 23.4},
            {19.7, 21.5, 22.1},
            {20.6, 15.3, 16.8},
            {18.0, 17.5, 19.2},
            {20.1, 18.9, 22.7},
            {21.9, 23.3, 24.0},
            {25.1, 23.8, 22.5}
        };
        String nomeBairro [] = {
            "Concórida",
            "Santa Amélia",
            "Palmares"
        };
        
        double media [] = new double[clima[0].length];

        for (int i = 0; i < clima[0].length; i++) {
            double total = 0;
            for (int j = 0; j < clima.length; j++) {
                total += clima[j][i];
            }
            media[i] = total / clima.length;
        }

        for (int i = 0; i < nomeBairro.length; i++) {
            System.out.printf("O bairro %s tem a média de temperatura de %.2f ºC%n", nomeBairro[i], media[i]);
        }

        //Definindo qual dia teve a maior temp

        double maiorTemp = clima[0][0];
        int bairroMaior = 0;
        int diaMaior = 0;

        for (int i = 0; i < clima.length; i++) {
            for (int j = 0; j < clima[0].length; j++) {
                if (clima[i][j] > maiorTemp) {
                    maiorTemp = clima[i][j];
                    bairroMaior = j;
                    diaMaior = i + 1;
                }
            }
        }

        System.out.printf("\nA maior temperatura registrada foi %.2fºC no %d° dia do bairro %s.\n", maiorTemp, diaMaior, nomeBairro[bairroMaior]);

    }

}
