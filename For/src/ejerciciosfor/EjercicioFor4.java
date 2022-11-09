package ejerciciosfor;

import java.util.Scanner;

public class EjercicioFor4 {
/*Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que introducimos por teclado.*/
	public static void main(String[] args) {
		//declaramos la variable numUser
		int numUser;
		int contadorM = 0;
		//Iniciamos el scanner 
		Scanner lee = new Scanner (System.in);
		
		System.out.println("Por favor introduzca un numero: ");
		
		numUser = lee.nextInt();
		
		/*En este for declaramos el inicio a 3
		 * la condicion es que i sea menor que el mnumero introducido
		 * y el contador irá incrementando de 3 en 3*/
		for (int i=3; i<=numUser; i=i+3) {
			//Al contador de multiplos le incrementaremos 1 en cada vuelta
			contadorM++;
			
		}
		System.out.println("La cantidad de multiplos de 3 hasta el numero introducido es: " + contadorM);

		//cerramnos el scanner
		lee.close();
	}

}
