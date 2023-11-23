package main;

/**
 * Actividad 3 - Array
 * 
 * Crea un programa que genere un array de números enteros aleatorios (puedes buscar en Internet cómo hacer
 * esto), luego encuentre y muestre el número más grande en el array.
 * 
 * @author elena
 */

public class Actividad3 {
	
	/**
	 * Este es mi método main
	 * @param args
	 */

	public static void main(String[] args) {
		
		/**
		 * Array.toString(tipo_de_dato + _nombrearray);
		 */
		
		/**
		 * Aquí declaro las variables
		 */
		
		int array[] = new int [10];
		int longitud = array.length;
		int max = array[0];
		
		
		/**
		 * Aquí creo un bucle para crear el array
		 */
		
		for (int i = 0; i < longitud; i++) {
			array[i] = (int) Math.round(Math.random()*100);
	
		}
		
		/**
		 * Aquí creo otro bucle para imprimir el array
		 */
		
		for (int matriz: array) {
			System.out.print(matriz + " ");
		}
		
		/**
		 * Aquí creo otro bucle para recorrer el array en busca del número máximo
		 */
		
		for (int i = 1; i < longitud; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		/**
		 * Aquí imprimo el resultado
		 */
		System.out.println("\n" + "El número máximo es: " + max);
		
	}

}




