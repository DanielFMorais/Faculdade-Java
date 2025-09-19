public class Circulo {

    private double raio;
    
    public Circulo (double raio) {

        this.raio = raio;
        
    }
    
    public void calcularArea () {

        double area = (Math.PI * Math.pow(raio, 2) );

       System.out.printf("A área do circulo é de: %.2f", area);
    }

    public void calcularPerimetro () {

        double perimetro = (2 * Math.PI * raio);

        System.out.println("O Perímetro do Circulo é de: " + perimetro);

    }

}
