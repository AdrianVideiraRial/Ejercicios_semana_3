import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        /*Crea un programa que recoja 3 datos del usuario y muestre si son el mismo
        dato alguno de ellos. Pista: (variable1 == variable2) o…
        */

        Scanner entrada = new Scanner(System.in);
        int dato1;
        int dato2;
        int dato3;

        System.out.println("Escriba 3 numeros enteros");
        dato1 = entrada.nextInt();
        dato2 = entrada.nextInt();
        dato3 = entrada.nextInt();

        //Comparación entre 3 datos.
        if(dato1==dato2|dato2==dato3|dato2==dato3){
            System.out.println("Hay coincidencias");
        }
        else {
            System.out.println("No hay coincidencias");
        }

    }
}
