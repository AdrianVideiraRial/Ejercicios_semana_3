import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        /*Crea un programa que compare dos cadenas de texto y muestre por
        pantalla si son la misma.
        */

        // Establecemos Datos

        Scanner entrada = new Scanner(System.in);
        String texto1 = "";
        String texto2 = "";

        System.out.println("Escriba el texto 1");
        texto1 = entrada.nextLine();

        System.out.println("Escriba el texto 2");
        texto2 = entrada.nextLine();

        //Establecemos condición

        if(texto1.equals(texto2)){
            System.out.println("Los textos son iguales");
        }
        else{
            System.out.println("Los textos son diferentes");
        }
    }

}
