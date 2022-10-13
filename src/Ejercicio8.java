import java.util.Scanner;

public class Ejercicio8 {
    public static void  main(String[] args) {

        /*Crea un programa que compare dos datos introducidos por el usuario y
        muestre por pantalla si tienen el mismo valor o no.
        */

        //Definimos valores y establecemos el Scanner
        Scanner entrada = new Scanner(System.in);
        int valor1 =0;
        int valor2 =0;

        System.out.println("Introducir valor 1 a comparar");
        valor1= entrada.nextInt();

        System.out.println("Introducir valor 2 a comparar");
        valor2 = entrada.nextInt();

        //Establecemos la condición.

        if (valor1==valor2){
            System.out.println("Es el mismo valor!!");
        }
        else{
            System.out.println("Los valores son distintos!!");
        }


    }
}
