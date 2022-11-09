package ejerciciosfor;

import java.util.Scanner;

public class EjercicioFor1 {
/*Escribir una aplicación para aprender a contar
 * , que pedirá un número n y mostrará todos los números del 1 al n.*/
	public static void main(String[] args) {
	//declaramos las variables
		int numUser;
		
	//Iniciamos el Scanner
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca un numero: ");
		numUser = lee.nextInt();
		
		/*Iniciamos un for*/
		for (int i=1; i<= numUser; i++) {
			System.out.println(i);
		}
		
		//cerramos el scanner
		lee.close();
		
		
	}

}
