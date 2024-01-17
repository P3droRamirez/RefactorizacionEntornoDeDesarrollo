
package proyectopruebaentorno;

import java.util.Scanner;

public class Ejercicio2ParaCambiarCalculadora {
   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Seleccione la operación: \n1. Suma\n2. Resta\n3. Multiplicación\n4. División");
        int opcion = scanner.nextInt();

        double resultado = 0;

        if (opcion == 1) {
            resultado = numero1 + numero2;
            System.out.println("El resultado de la suma es: " + resultado);
        } else if (opcion == 2) {
            resultado = numero1 - numero2;
            System.out.println("El resultado de la resta es: " + resultado);
        } else if (opcion == 3) {
            resultado = numero1 * numero2;
            System.out.println("El resultado de la multiplicación es: " + resultado);
        } else if (opcion == 4) {
            if (numero2 != 0) {
                resultado = numero1 / numero2;
                System.out.println("El resultado de la división es: " + resultado);
            } else {
                System.out.println("No se puede dividir por cero.");
            }
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    
    }
}
