
package proyectopruebaentorno;

import java.util.Scanner;

public class Ejercicio1ParaCambiar {

    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

        System.out.println("Por favor introduzca un numero entero");
        int entero1 = sc.nextInt();
        System.out.println("Por favor introduzca un segundo numero entero");
        int entero2 = sc.nextInt();

        int menor = 0;
        int mayor = 0;

        if (entero1 < entero2) {
            menor = entero1;
            mayor = entero2;
        } else {
            menor = entero2;
            mayor = entero1;
        }

        System.out.println("Los numeros comprendidos entre el " + menor + " y el " + mayor + " son : ");

        int resultado = 0;
        for (int i = menor; i <= mayor; i++) {
            resultado = 1;
            System.out.println(i + " ");
        }
        sc.close();
    
    }
    
}
