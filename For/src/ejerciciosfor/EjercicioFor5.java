package ejerciciosfor;

import java.util.Scanner;

public class EjercicioFor5 {
/*Pedir diez números por teclado y mostrar la media.*/
	public static void main(String[] args) {
		//Declaramos las variables
		int numUser=0;
		int total=0;
		//Iniciamos el Scanner
		Scanner lee = new Scanner(System.in);
		
		//solicitamos los numeros
		System.out.println("Por favor introduzca 10 numeros(despues de escribir uno presione 'enter'): ");
		
		/*En este for establecemos que el inicio sea 1, la condicion sea que i es menor o igual a 10
		 * y el contador se incrementará en 1*/
		
		for (int i=1; i<=10 ;i++) {
			
			//leemos el numero del usuario
			numUser = lee.nextInt();
		
			// y lo añadimos al total
			total+=numUser;
		
		}
		//imprimimos el total dividido entre 10
		
		System.out.println(total/10);
		
		//cerramos el scanner
		lee.close();
	}

}
