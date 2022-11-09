package ejerciciosfor;

import java.util.Scanner;
//comentar esto
public class EjercicioFor9 {
/*Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.*/
	public static void main(String[] args) {
		int numero;
		boolean esPrimo= true; /*No recuerdo el porque de esto pero 
		algo me dice que es para que siempre haga la verificacion
		debo preguntarlo*/
		
		/*Este es el ejercicio que hizo la profe*/
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Introduzca un entero positivo");
		
		//Leeamos el numero del usuario
		numero = lee.nextInt();
		
		/*Iniciamos un If donde si numero es mayor a 0 entonces*/
		if (numero>0) {
			/*Iniciaremos en 2(Esto no entendí bien por que y debo preguntarlo)
			 * La condicion es que i sea menor que numero y al contador se le incrementará en 1*/
			for ( int i=2; i<numero; i++) {
				
				/*Entonces iniciamos otro if donde si numero modulo i es igual a 0 entonces el numero NO es primo*/
				if (numero % i == 0){
					esPrimo = false;
					break;//Nos salimos del bucle porque ya sabiendo que no es primo solo comprobamos una vez
				/*Hay que intenntar hacer la menos comprobaciones posibles*/
				}
		}
			/*Aqui la profe utilizo una ternaria para que si la variable sale del bucle siendo true pues imprime que es primo
			 * en caso contrario pues que no lo es*/
			System.out.println(esPrimo ? "Es primo" : "No es primo");
			
		} else {//y aqui el Else es para el caso de que el usuario sea tonto
			System.out.println("introduzca un entero positvo");
		}
		
		//cerramos el scanner
		lee.close();
		}
		

	}


