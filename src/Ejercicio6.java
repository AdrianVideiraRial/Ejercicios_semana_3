import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        /* Crea el programa del ejercicio 3, pero esta vez los valores deben obtenerse preguntando al usuario
        */

        Scanner entrada = new Scanner(System.in);
        String variable1 = "";
        String variable2 = "";
        String variable3 = "";

        System.out.println("¿Como te llamas?");
        variable1 = entrada.nextLine();

        System.out.println("¿Cual es tu localidad?");
        variable2 = entrada.nextLine();

        System.out.println("¿Que te gusta hacer?");
        variable3 = entrada.nextLine();

        System.out.println("Hola, mi nombre es "+variable1+"\nVivo en "+variable2+"\nMe gusta "+variable3);

    }
}
