import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*Crea el programa del ejercicio 1, pero esta vez los valores deben de obtenerse preguntando al usuario.
        Pista: variable = prompt(“Introduce…”)
        */

        Scanner entrada= new Scanner(System.in);
        float base; // ancho rectángulo
        float altura; // altura rectángulo
        float resultado =0;

        System.out.println("¿Valor del ancho del rectangulo?");
        base = entrada.nextFloat();

        System.out.println("¿Valor del alto del rectangulo?");
        altura = entrada.nextFloat();

        resultado = base * altura; // calculo area rectángulo (base * altura)
        System.out.println("El area del rectangulo es " + resultado);
    }

  }
