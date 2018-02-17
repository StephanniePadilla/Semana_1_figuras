package Figura;
import java.lang.Comparable;

public abstract class Figura implements Comparable<Figura>{ //Clase principal

    private double area;

    public abstract double area();//llamamos a la funcion area de cada figura

    public int compareTo (Figura in){
        double d;
        d = this.area() - in.area();

        int res;
        res= (int) d; //convertimos el double en un interger

        return res;
    }
}
