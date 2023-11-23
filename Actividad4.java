package main;
import java.util.Scanner;

/**
 * Actividad 4 - Array
 * 
 * Crea un programa que busque un número específico en un array de números enteros. Si el número se encuentra
 * en el array, muestra su posición; de lo contrario, muestra un mensaje indicando que el número no se encontró.
 * 
 * @author elena
 */

public class Actividad4 {
	
	/**
	 * Método Main
	 * @param args
	 */

	public static void main(String[] args) {
		
		/**
		 * Aquí declaro las variables
		 */
		
		Scanner scanner = new Scanner (System.in);
		int array [] = new int [10];
		int longitud = array.length;
		boolean encontrado = false;
		System.out.print ("Dime un número y te lo busco en el array: " + "\n");
		int num = scanner.nextInt();
		
		scanner.close();
		
		/**
		 * Aquí recorro el array con un bucle for para rellenarle
		 */
		
		for (int i = 0; i < longitud; i++) {
			array [i] = (int) Math.round(Math.random()*100);
		}
		
		/**
		 * Aquí recorro el array para imprimirlo
		 */
		
		for(int matriz: array) {
			System.out.print(matriz + " ");
		}
		
		/**
		 * Aquí recorro el array para buscar el número y decir la posición en la que se encuentra 
		 */
		
		for (int i = 1; i < longitud; i++) {
			
			/**
			 * Si el programa encuentra el número escribe este mensaje
			 */
			
			if (array[i] == num) {
				System.out.println ("\n" + "El número " + num + " está en el array en la posición: " + i );
				encontrado = true;
			}
		}
		
		/**
		 * Si no lo encuentra pone este mensaje
		 */
		
		if (!encontrado) {
			System.out.println("El número " + num + " no se ha encontrado");
		}
	}
}
