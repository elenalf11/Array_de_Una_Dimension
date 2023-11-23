package main;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Actividad 6 - Arrays
 * 
 * Escribe un programa que inserte un elemento en un  ́ındice determinado. Tanto el elemento como el  ́ındice se le
 * deben pedir al usuario. El array desplazará todos los elementos hacia la derecha para poder insertar el nuevo
 * elemento, por lo que se eliminará el ́ultimo elemento del array.
 * 
 * @author elena
 */

public class Actividad6 {
	
	/**
	 * Método Main
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		/**
		 * Escribo el array original
		 */
		
		int [] array = {25 , 14 , 56 , 15 , 36 , 56 , 77 , 18 , 29 , 49};
		System.out.print("El array original es: " + Arrays.toString(array)+ "\n");
		
		/**
		 * Declaro las variables
		 */
		
		System.out.println("Dime la posición del nuevo elemento de la array: ");
		int posicion = scanner.nextInt();
		System.out.println("Dime el nuevo número: " + "\n");
		int elemento = scanner.nextInt();
		scanner.close();
		
		/**
		 * Creo el nuevo array
		 */
		
		for (int i = array.length - 1 ; i > posicion ; i--) { 
			array[i] = array[i - posicion];
		}
		
		/**
		 * Escribo el nuevo array
		 */
		
		array[posicion] = elemento;
		System.out.print("El nuevo array con el elemento " + elemento + " :" + Arrays.toString(array));
		
		
		
		
		
		
	}

}
