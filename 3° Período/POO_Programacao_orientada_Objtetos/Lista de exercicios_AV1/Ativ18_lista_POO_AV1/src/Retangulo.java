public class Retangulo {
    private double base, altura;

    public Retangulo (double base, double altura) {

        this.base = base;
        this.altura = altura;

    }
    
    public void areaRetangulo () {

        double area = (base * altura);

        System.out.println("A área do retangulo é de: " + area);

    }

    public void perimetroRetangulo () {

        double perimetro = 2*(base + altura);

        System.out.println("O perímetro do retangulo é de: " + perimetro);

    }

}
