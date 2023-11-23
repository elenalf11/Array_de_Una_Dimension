package main;

/**
 * Actividad 2 - Array
 * 
 * Desarrolla un programa que cree un array de números enteros, cuente cuántos de ellos son números pares y
 * cuántos son números impares. Muestra el resultado.
 *	
 * @author elena
 */

public class Actividad2 {
	
	/*
	 * Mi método main 
	 * @param args
	 */

	public static void main(String[] args) {
		
		/**
		 * Aquí declaro las variables
		 */
		int num[] = new int [10];
		int longitud = num.length;
		int pares = 0;
		int impares = 0;
		
		/**
		 * Aquí creo el primer bucle para rellenar el array
		 */
		for (int i = 0; i < longitud; i++) {
			num[i] = (int) Math.round(Math.random()*100);
			
			/**
			 * Aquí creo un condicional para saber que números son pares y cuáles impares
			 */
			
			if (num[i] % 2 == 0) {
				pares += 1;
			}
			else {
				impares +=1;
			}
		}
		
		/**
		 * Aquí creo otro bucle para imprimir el array
		 */
		
		for (int matriz: num) {
			System.out.print(matriz + "  ");
		}
		/**
		 * Aquí imprimo cuántos números pares e impares hay
		 */
		
		System.out.println ("\n" + "Hay " + pares + " números pares");
		System.out.println("Hay " + impares + " números impares");
	}

}
