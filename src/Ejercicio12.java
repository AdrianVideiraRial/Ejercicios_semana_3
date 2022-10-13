import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        /* Crea un programa que compruebe, dada la edad introducida por el
        usuario, que puede obtener el permiso de conducción (18 años), mostrando por pantalla True o False.
        Pista: El operador ternario ‘?’
        */

        Scanner x=new Scanner(System.in);
        int age=0;
        System.out.println("Introduzca su edad");
        age= x.nextInt();

        //Creamos nuestra variable String para poder realizar la operación.
        String result;
        result = (age>=18) ? "Puedes obtener el permiso de circulación" : "No puedes obtener el permiso de circulación";
        System.out.println(result);







    }
}
