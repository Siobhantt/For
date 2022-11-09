package ejerciciosfor;

import java.util.Scanner;

public class EjercicioFor10 {
/*Realiza un programa que pida dos números enteros A y B, siendo B mayor que A.
 *  Luego visualiza los números desde A hasta B.*/
	public static void main(String[] args) {
	
		//Declaramos las variables
		int num1;
		int num2;

		//Iniciamos la variable
		Scanner lee = new Scanner(System.in);
		
		//imprimimos la solicitud
		System.out.println("Por favor introduzca el 1º numero: ");
		num1 = lee.nextInt();
		
		System.out.println("Por favor introduzca el 2º numero, (debe ser mayor que el 1º numero): ");
		num2 = lee.nextInt();
		
		/*Iniciamos un For donde el inicio será el primer numero introducido
		 * la condicion será que el 1º numero sea menor o igual al 2º numero
		 * y el contador se incrmeentará una vez cada vuelta*/
		for (int i = num1; i<=num2; i++) {
			//Imprimimos el contador
			System.out.println(i);
			
		}
		
		//cerramos el scanner
		lee.close();
		
		
		
	}

}
