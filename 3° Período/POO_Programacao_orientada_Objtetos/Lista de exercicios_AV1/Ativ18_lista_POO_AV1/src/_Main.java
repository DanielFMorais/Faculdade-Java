import java.util.Scanner;

public class _Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //==== circulo
        System.out.println("Vamos tratar inicialmente dos circulos");
        System.out.print("Por favor me informe o raio do seu circulo:");
        double raio = sc.nextDouble();
        sc.nextLine();

        Circulo c = new Circulo(raio);

        c.calcularArea();
        System.out.println();
        System.out.println("==============================================");
        //==== Retangulo 
        System.out.println("Vamos tratar agora dos retângulos");
        System.out.println("Por favor, me informe a Base do retangulo, e logo em seguida a sual altura: ");
        System.out.print("Base:");
        double base = sc.nextDouble();
        System.out.print("Altura");
        double altura = sc.nextDouble();
        sc.nextLine();

        Retangulo r = new Retangulo (base, altura);

        r.areaRetangulo();
        r.perimetroRetangulo();

        sc.close();

    }
   
}
