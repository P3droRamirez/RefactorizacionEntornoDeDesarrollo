package proyectopruebaentorno;

import java.util.Scanner;

public class Ejercicio4ParaCambiarArrays {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del array:");
        int n = s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            arr[i] = s.nextInt();
        }

        System.out.println("Los números ingresados son:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += arr[i];
        }
        System.out.println("La suma de los números es: " + suma);

        s.close();
    
}
}
