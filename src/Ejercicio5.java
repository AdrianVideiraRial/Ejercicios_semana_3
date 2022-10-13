import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        /* Crea el programa del ejercicio 2, pero esta vez los valores deben de obtenerse preguntando al usuario.
        */

        Scanner entrada = new Scanner(System.in);
        // Datos solicitados a usuario.
        int radio = 0; // Radio
        final double PI = 3.1415; // Numero PI

        //Solicitamos Datos al usuario.
        System.out.println("Defina radio circunferencia");
        radio = entrada.nextInt();

        // Calculamos el area
        double area = PI * radio;
        System.out.println("El area de la circumferencia es "+area);

        // Calculamos la longitud
        double longitud = 2*PI*radio;
        System.out.println("La longitud de la circunferencia es "+longitud);

    }
}
