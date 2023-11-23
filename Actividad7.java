package main;

import java.util.Arrays;

/**
 * Actividad 7 - Arrays
 * 
 * Desarrolla un programa que tome un array de números y elimine los elementos duplicados, dejando solo una
 * instancia de cada número. Date cuenta de que sería difícil eliminar elementos duplicados si el array no está
 * ordenado. Por esta razón, la idea es crear un array a mano, ordenarlo utilizando el método sort() de los arrays,
 * y entonces empezar a comprobar si hay elementos duplicados.
 * 
 * @author elena
 */

public class Actividad7 {
	
	/**
	 * Método Main
	 * @param args
	 */

	public static void main(String[] args) {
		
		/**
		 * Declaro las variables
		 */
		
		int [] array = {5, 9, 15, 5, 36, 65, 36, 90, 15};
		int longitud = array.length;
		int repetidos = 0;
		
		/**
		 * Escribo el array
		 */
		
		System.out.print("Este es el array original con duplicados: " + Arrays.toString(array) + "\n");
		
		/**
		 * Ordeno de menor a mayor el array con el método sort()
		 */
		
		Arrays.sort(array);
		
		/**
		 * Recorro el array en busca de los números repetidos	
		 */
		
		for (int i = 0; i < longitud - 1; i++) {
			if (array[i] != array [i + 1]) {
				array[repetidos] = array[i];
				repetidos++;
			}
		}
		
		/**
		 * Dejo solo un elemento de los que se hayan repetido eliminando sus posiciones del array
		 */
		
		array[repetidos] = array [longitud - 1];
		
		/**
		 * Escribo el nuevo array sin los elementos repetidos
		 */
		
		System.out.print("Este es el array sin duplicados: ");
		for (int i = 0; i <= repetidos; i++) {
			System.out.print(array[i] + " ");
		}
		

	}

}
