package com.eduit.ejercicios;
/**
 * 6) Almacenar 15 números en un vector, almacenarlos en otro vector en orden
 * inverso al vector original e imprimir el vector resultante
 */
public class AppPrincipal2 {

	public static void main(String[] args) {

		int[] vectorA = { 1, 2, 33, 4, 5, 65, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		int[] vectorResultante = new int[15];

		int j = 14;

		// copio los datos de a en resultante en el orden inverso
		for (int i = 0; i < vectorResultante.length; i++) {
			vectorResultante[j] = vectorA[i];
			j--;
		}

		System.out.println("vector A");
		
		for (int i = 0; i < vectorA.length; i++) {
			System.out.print(vectorA[i] + " - ");
		}
		System.out.println();
		System.out.println("Vector Resultante");
		
		for (int i = 0; i < vectorResultante.length; i++) {
			System.out.print(vectorResultante[i] + " - ");
		}
		

	}

}
