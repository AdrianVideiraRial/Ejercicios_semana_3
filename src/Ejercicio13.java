import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*Crea un programa que dado un número, calcule la tabla de multiplicar (de 1 a 9) y la muestre por pantalla
        */

        Scanner x=new Scanner(System.in);
        int valor = 0; // Valor dado por el ususario.
        System.out.println("Escriba el numero de la tabla que desea");
        valor= x.nextInt();

        //Funcion "for" Desde 1 hasta 10 en incremento de +1 + la operacion de multiplicacion.
        for (int i=1; i<=10; i++) {
            System.out.println(valor+"*"+i+"="+(valor*i));

        }

    }
}
