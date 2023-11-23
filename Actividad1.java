package main;

/**
 * Actividad 1 - Array
 * 
 * Escribe un programa que cree un array de números enteros, calcule la suma de todos los elementos en el array
 *	y muestre el resultado.
 *	
 * @author elena
 */

public class Actividad1 {
	
	/**
	 * Método main
	 * @param args
	 */

	public static void main(String[] args) {
		
		/**
		 * Aquí declaro las variables
		 */
	
		int [] numeros  = {1,2,3,4,5,6,7,8,9};
		int suma = 0;
		
		
		/**
		 * Aquí creo el bucle que recorre el array y realiza la suma
		 */
		
		for (int numero : numeros) {
			suma += numero;
		}
		 /**
		  * Aquí imprimo el array completo
		  */
		for (int matriz: numeros) {
			System.out.print(matriz + " ");
			
		}
		
		/**
		 * Aquí imprimo la suma de cada valor del array
		 */
		System.out.println("La suma del array = " + suma);
		
		
		
		
		
		
		
		

	}

}
