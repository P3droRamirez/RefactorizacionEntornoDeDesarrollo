
package proyectopruebaentorno;

import java.util.Scanner;

public class Ejercicio2ParaCambiarCalculadora {

	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        double numero1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        double numero2 = scanner.nextDouble();

        System.out.println("Seleccione la operacion: \n1. Suma\n2. Resta\n3. Multiplicación\n4. División");
        int opcion = scanner.nextInt();

        switch(opcion){
        double resultado = 0;
        case 1: 
        	resultado = numero1 + numero2;
            System.out.println("El resultado de la suma es: " + resultado);
				break;
		case 2: 
			resultado = numero1 - numero2;
            System.out.println("El resultado de la resta es: " + resultado);
            break;
		case 3: 
			resultado = numero1 * numero2;
            System.out.println("El resultado de la multiplicación es: " + resultado);
			break;
		case 4: 
			 if (numero2 != 0) {
	                resultado = numero1 / numero2;
	                System.out.println("El resultado de la división es: " + resultado);
	            } else {
	                System.out.println("No se puede dividir por cero.");
	            }
			break;
		default: System.out.println("Opcion Incorrecta");
		break;
        
        
        }
        scanner.close();
    
    }
}
