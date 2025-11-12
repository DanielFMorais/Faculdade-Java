import java.util.Random;

public class Question4 {

    public static void main(String[] args) {
        
        Random randon = new Random();

        int [] valores1 = new int[15];
        int [] valores2 = new int[valores1.length];

        for (int i = 0; i < valores1.length; i++){
            valores1[i] = randon.nextInt(100);
        }

        for (int i = (valores1.length - 1); i >= 0; i--){
            valores2[(valores1.length - 1) - i] = valores1[i];
        }


        for (int n : valores1){
            System.out.print(n + " ");
        }
        System.out.println();
        for (int n : valores2){
            System.out.print(n + " ");
        }
    }

}
