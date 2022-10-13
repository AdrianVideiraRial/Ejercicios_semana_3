import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        /* Crea un programa que recoja el valor introducido por el usuario y calcule el
        módulo y lo muestre por pantalla
        */

        Scanner in = new Scanner(System.in);
        float valor1 = 0f;
        float valor2 = 0f;

        //Solicitamos el dividendo
        System.out.println("Escriba valor del dividendo");
        valor1 = in.nextFloat();

        //Solicitamos el divisor
        System.out.println("Escriva valor del divisor");
        valor2 = in.nextFloat();

        //Resultado de la operacion
        float resultado = valor1 % valor2;
        System.out.println("El modulo de la operaciones " + resultado);

    }
}
