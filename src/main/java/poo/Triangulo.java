package poo;

public class Triangulo {


    public static String tipoTriangulo(int a, int b, int c){

        if((a == b)&&(b == c)){
            return "equilatero";
        }
        else if ((a == b)||(a == c)||(b == c)){
            return "isosceles";
        }
        // escaleno
        // todos diferentes
        else {
            return "escaleno";
        }
        //return "não implementado";
    }
}
