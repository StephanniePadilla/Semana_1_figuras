package Figura;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double r){ //contructor circulo
        this.radio = r;
    }

    public double area ()
    {
        double area;
        area = Math.PI* Math.sqrt(this.radio);
        return area;
    }
}
