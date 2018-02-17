import Figura.*;
import java.util.Arrays;

public class GestorFigura {

    public static double suma(Figura[] figuras) {
        double suma = 0;

        for (Figura f : figuras) {
            suma = suma + f.area();
        }
        return suma;
    }

    public static void main(String[] args) {
        Figura[] f = new Figura[4];
        f[0] = new Circulo(45.3);
        f[1] = new Cuadrado(25.4);
        f[2] = new Triangulo(14.1, 52.36);
        f[3] = new Rectangulo(15.26, 45.25);


        System.out.println("suma="+suma(f));  //nos dice la suma de todas las areas

        for (Figura a : f) {//nos pone el area de cada figura
            System.out.print("\n area="+a.area());
        }

        Arrays.sort(f);//nos ordena por tamaño las figuras (de menor a mayor)
        System.out.print("\n\n");
        for (Figura i : f) {//Mostramos el array ya ordenado
            System.out.print(i+" < ");
        }


    }
}