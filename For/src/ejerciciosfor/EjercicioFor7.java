package ejerciciosfor;

import java.util.Scanner;

public class EjercicioFor7 {
/*Pedir un número y calcular su factorial.
 *  Por ejemplo, el factorial de 5 se denota 5! y es igual a 5x4x3x2x1 = 120.*/
	public static void main(String[] args) {
		
		//declaramos las variables
		int numUser;//en esta variable guardaremos el numero del usuario
		int factorial = 1; //en esta variable guardaremos el calculo del factorial 
		
		//Iniciamos el scanner
		Scanner lee = new Scanner(System.in);
		
		//leemos el numero introducido
		System.out.println("Por favor introduzca un numero: " );
		numUser = lee.nextInt();
		
		/*iniciamos un for donde nuestro inicio será 1
		 * la condicion es que sea menor o igual al numero introducido, asi el bucle hará las vueltas necesarias
		 * incrementamos el contador a 1*/
		
		for (int i=1; i<=numUser; i++) {
			
			factorial = factorial *i; 
		}
		System.out.println("El factorial de " + numUser + " es igual a " + factorial);
		//cerramos el scanner
		lee.close();
	}

}
