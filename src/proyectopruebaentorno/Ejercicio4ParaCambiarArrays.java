package proyectopruebaentorno;

import java.util.Scanner;

public class Ejercicio4ParaCambiarArrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Ingrese el tama�o del array:");
		int tama�o = s.nextInt();

		int[] numeros = new int[tama�o];

		for (int i = 0; i < n; i++) {
			System.out.println("Ingrese el numero " + (i + 1) + ":");
			numeros[i] = s.nextInt();
		}

		System.out.println("Los numeros ingresados son:");
		for (int i = 0; i < n; i++) {
			System.out.println(numeros[i] + " ");
		}

		int suma = 0;
		for (int i = 0; i < n; i++) {
			suma += arr[i];
		}
		System.out.println("La suma de los numeros es: " + suma);

		s.close();

	}
}
