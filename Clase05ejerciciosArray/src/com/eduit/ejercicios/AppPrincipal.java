package com.eduit.ejercicios;

/***
 * 2) Llenar dos vectores A y B de 45 elementos cada uno, sumar el elemento uno
 * del vector A con el elemento uno del vector B y así sucesivamente hasta 45,
 * almacenar el resultado en un vector C, e imprimir el vector resultante por
 * pantalla.
 */
public class AppPrincipal {

	public static void main(String[] args) {
		final int CANTIDAD_DE_ELEMENTOS = 45;

		// defino los 3 vectores de 45 elementos cada uno
		int[] vectorA = new int[CANTIDAD_DE_ELEMENTOS];
		int[] vectorB = new int[CANTIDAD_DE_ELEMENTOS];
		int[] vectorC = new int[CANTIDAD_DE_ELEMENTOS];

		// recorro loos vectores
		for (int i = 0; i < CANTIDAD_DE_ELEMENTOS; i++) {
			// cargo de datos vector a y b
			vectorA[i] = i*2;
			vectorB[i] = i*3;
			// guardo en c la suma de a y b
			vectorC[i] = vectorA[i] + vectorB[i];
			// mostramos los resultados
			System.out.println(vectorA[i] + " + " + vectorB[i] + " = " + vectorC[i]);
		}

	}

}
