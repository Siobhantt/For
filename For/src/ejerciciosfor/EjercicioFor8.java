package ejerciciosfor;

import java.util.Scanner;

public class EjercicioFor8 {
/*Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.*/
	public static void main(String[] args) {
		
		//declaramos las variables
		double calificacion;
		/*int contador=0;*/
		
		//iniciamos el scanner e imprimimos la solicitud
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca sus calificaciones: ");
		
		for(int i=1; i<=5; i++) {	
			
	
			calificacion =lee.nextDouble();
	
			if (calificacion <0 || calificacion >10) {
				System.out.println("Calificacion fuera de rango, introduca un calificacion valida. ");
			calificacion = lee.nextDouble();
			}
			
			if (calificacion <5) {
			System.out.println("Calificacion " + i +  "º" + " está suspensa");
			}
			/*calificacion = lee.nextInt();
			if (calificacion <5)
				contador++;*/	
		}
		/*Si es la segunda solucion tengoq que mostrar un sysout del contador*/
		
		
		//cerramos el scanner
		lee.close();
 	}

}
