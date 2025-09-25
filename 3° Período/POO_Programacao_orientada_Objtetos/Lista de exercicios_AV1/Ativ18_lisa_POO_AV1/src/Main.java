import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo c = new Circulo(10);

        System.out.printf("\nO valor da área do circulo = %.2f",c.areaCirculo());
        System.out.printf("\nO valor do perímetro do circulo = %.2f",c.perimetroCirculo());

        Retangulo r = new Retangulo(10,10);

        System.out.printf("\nA área do retangulo = %,2f",r.areaRetangulo());
        System.out.printf("\nO perímetro do retangulo = %,2f",r.perimetroRetangulo());




        sc.close();
    }
}
