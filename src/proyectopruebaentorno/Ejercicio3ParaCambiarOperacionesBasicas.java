
package proyectopruebaentorno;

import java.util.Scanner;

public class Ejercicio3ParaCambiarOperacionesBasicas {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = scanner.nextInt();

        int s = numero1 + numero2;
        int r = numero1 - numero2;
        int m = numero1 * numero2;

        if (s % 2 == 0) {
            System.out.println("La suma de " + numero1 + " y " + numero2 + " es par.");
        } else {
            System.out.println("La suma de " + numero1 + " y " + numero2 + " es impar.");
        }

        System.out.println("La resta de " + numero1 + " y " + numero2 + " es: " + r);
        System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es: " + m);

        scanner.close();
    
    }
}
