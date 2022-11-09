package ejerciciosfor;

public class EjercicioFor6 {
/*Diseñar un programa que muestre la suma de los 10 primeros números impares.*/
	public static void main(String[] args) {
		
		//Declaramos nInpar a cero que será donde guardaremos la suma de los numero inpares
		int nInpar= 0;

		/*En este for declaramos que el inicio sea 1 (i =1)
		 * i menor igual a 19 que será el tope porque 19 es el decimo numero inpar
		 * y tambien que el modulo de 1 sea igual a 1 para que unicamente inprima los impares
		 * y al contador le vamos incrementando 2 */
		for (int i=1; i <= 19 && i%2==1;i=i+2) {
		//sumamos la i al contador de inpares en cada vuelta
			nInpar+=i;
		
		}
		//imprimimos el contador de impares
		System.out.println("La suma de los primeros 10 numeros impares equivales a :" +  nInpar);
	}
		
}
