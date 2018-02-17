package Figura;

public class Triangulo extends Figura {
    private double base;
    private double altura;

   public void triangulo (double b, double h){ //consstrustor triangulo
       this.base=b;
       this.altura = h;
   }
    public double area() {
        double area;
        area = (this.base*this.altura)/2;
        return area;
    }
}
