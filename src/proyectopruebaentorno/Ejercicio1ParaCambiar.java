
package proyectopruebaentorno;

import java.util.Scanner;

public class Ejercicio1ParaCambiar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor introduzca un numero entero");
		int numero1 = sc.nextInt();
		System.out.println("Por favor introduzca un segundo numero entero");
		int numero2 = sc.nextInt();

		if(numero1 > numero2) {
			System.out.println("El segundo número debe ser mayor que el primero: ");
			numero2 = sc.nextInt();
		}

		System.out.println("Los numeros comprendidos entre el " + numero1 + " y el " + numero2 + " son : ");
		
		int resultado = 0;
		for (int i = menor; i <= mayor; i++) {
			resultado = 1;
			System.out.println(i + " ");
		}
		sc.close();

	}

}
