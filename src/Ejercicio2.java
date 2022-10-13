public class Ejercicio2 {
    public static void main(String[] args) {
        /*Crea un programa que, dado un valor de radio, calcule el área y la longitud
        de una circunferencia y lo muestre por pantalla.
        Pista: a = pi x r2 , L = 2 x pi x r
        */

        int r = 15; // Radio
        final double PI = 3.1415; // Numero PI
        
        // Calculamos el area
        double area = PI * r;
        System.out.println(area);

        // Calculamos la longitud

        double longitud = 2*PI*r;
        System.out.println(longitud);

    }
}
