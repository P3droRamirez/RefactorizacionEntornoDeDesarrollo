
package proyectopruebaentorno;

import java.util.Scanner;

public class Ejercicio3ParaCambiarOperacionesBasicas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el primer numero:");
		int numero1 = scanner.nextInt();
		System.out.println("Ingrese el segundo numero:");
		int numero2 = scanner.nextInt();

		int suma = numero1 + numero2;
		int resta = numero1 - numero2;
		int producto = numero1 * numero2;

		if (suma % 2 == 0) {
			System.out.println("La suma de " + numero1 + " y " + numero2 + " es par.");
		} else {
			System.out.println("La suma de " + numero1 + " y " + numero2 + " es impar.");
		}

		System.out.println("La resta de " + numero1 + " y " + numero2 + " es: " + resta);
		System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es: " + producto);

		scanner.close();

	}
}
