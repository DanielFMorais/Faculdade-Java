public class Retangulo {
    double base;
    double altura;

    public Retangulo (double base, double altura){
        this.altura = altura;
        this.base = base;
    }

    public double areaRetangulo (){
        return (base * altura);
    }

    public double perimetroRetangulo (){
        return ((base + altura) * 2);
    }

}
