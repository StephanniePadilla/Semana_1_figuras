package Figura;

public class Rectangulo extends Figura {
    private double l1;
    private double l2;

    public Rectangulo (double a, double b){//contructor del rectangulo
        this.l1 = a;
        this.l2 = b;
    }

    public double area (){
        double area;
        area = this.l1*this.l2;
        return area;
    }
}
