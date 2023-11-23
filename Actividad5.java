package main;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Actividad 5 - Arrays
 * 
 * Escribe un programa que elimine un elemento específico del array (que será indicado por su  ́ındice dentro del
 * array). Todos los elementos se moverán a la izquierda hasta cubrir el elemento que se ha eliminado, por lo que
 * el  ́ultimo elemento del array quedar ́a duplicado.
 * 
 * @author elena
 */

public class Actividad5 {
	
	/**
	 * Método Main
	 * @param args
	 */

	public static void main(String[] args) {
		
		/**
		 * Aquí declaro las variables
		 */
		
		Scanner scanner = new Scanner (System.in);
		int array [] = {15 , 98 , 65 , 20 , 2 , 11 , 99 , 77 , 25 , 36};
		int longitud = array.length;
		
		/**
		 * Aquí escribo el array original
		 */
		
		System.out.println("Este es la  array: " + Arrays.toString(array));
		
		/**
		 * Pido al usuario la posición que desea "eliminar"
		 */

		System.out.print("Dime la posición que quieres eliminar del array: ");
		int num = scanner.nextInt();
		scanner.close();
		
		/**
		 * Recorro el array en busca de la posición, cuando lo encuentro lo modifico duplicando una de las posiciones porque el array no puede cambiar su longitud
		 */
		
		for (int i = num ; i < longitud - num ; i++) { 
			array[i] = array[i + num];
		}
		
		/**
		 * Aquí escribo el nuevo array
		 */
		
		System.out.println("Este es el array eliminando la posición " + num + " :" + Arrays.toString(array) );
		
		
		

	}

}
