public class Circulo {

    private double raio;
    
    public Circulo (double raio) {

        this.raio = raio;
        
    }
    
    public void calcularArea () {

        double area = (Math.PI * Math.pow(raio, 2) );

       System.out.println("A área do circulo é de: " + area);
    }

    public void calcularPerimetro () {

        double perimetro = (2 * Math.PI * raio);

        System.out.println("O Perímetro do Circulo é de: " + perimetro);

    }

}
