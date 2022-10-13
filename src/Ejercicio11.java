import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        /*Crea un programa que recoja un dato del usuario, lo incremente en 1, que el
        usuario introduzca otro dato y que multiplique el nuevo dato por el anterior
        incrementado y lo muestre por pantalla.
        */

        Scanner s = new Scanner(System.in);
        float dato1 = 0f;
        System.out.println("Escriba un número");
        dato1= s.nextFloat();

        float Operacion1 =++dato1; //valor incrementado en +1
        float multiplicador=0f;// Será el valor por el que multiplicaremos nuestra Operacion1

        System.out.println("Escriba otro numero");
        multiplicador= s.nextFloat();

        float Operacion2= Operacion1*multiplicador; // Realizamos la operacion final
        System.out.println("El resultado es "+Operacion2);

    }
}
