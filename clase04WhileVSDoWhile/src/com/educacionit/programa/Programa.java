package com.educacionit.programa;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		/***
		 * // - se ejecute una sola vez // - se ejecute N veces // - No se ejecuta nunca
		 * int contador = 0;
		 * 
		 * while (contador < 0) { System.out.println("Hola while"); }
		 * 
		 * // LA VAMOS A UTILIZAR CUANDO SE DESEA QUE SE EJECUTE AL MENOS UNA VEZ // LAS
		 * SENTENCIA DE CODIGO
		 * 
		 * 
		 * // - se ejecute una sola vez SI o SI // - se ejecute N veces do { // cuerpo
		 * del do while System.out.println("Hola do while"); contador++; } while
		 * (false);
		 */

//		ejercicio Ejemplo do while 

		// 1) desarrollar un algoritmo que permita ingresar 10 numeros enteros por
		// teclado y muestre por pantalla el promedio
		float limite = 10, suma = 0, promedio = 0, num = 0;
		Scanner teclado = new Scanner(System.in);
		int contador = 1;

		do {
			System.out.println("ingrese el  numero " + contador);
			num = teclado.nextFloat();
			suma += num;
			contador++;

		} while (contador <= limite);

		promedio = suma / limite; // calculamos el promedio de los diez numeros

		System.out.println("El promedio de los diez numeros ingresados es : " + promedio);

		teclado.close();
	}

}
