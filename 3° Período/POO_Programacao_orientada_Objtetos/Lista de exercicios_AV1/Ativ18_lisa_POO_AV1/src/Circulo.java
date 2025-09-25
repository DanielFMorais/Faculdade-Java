public class Circulo {

    double raio;

    public Circulo (double raio){
        this.raio = raio;
    }

    public double areaCirculo (){

        return (Math.PI*(raio * raio));
    }

    public double perimetroCirculo (){
        return  (2*Math.PI*raio);
    }
}
