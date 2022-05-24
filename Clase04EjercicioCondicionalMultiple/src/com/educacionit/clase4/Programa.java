package com.educacionit.clase4;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		/**
		 * Desarrollar un Algoritmo que permita ingresar un numero entero comprendido
		 * entre 1 y 10 , y que muestre por pantalla si el numero es par o impar
		 */
		// definos mis variabels de trabajo
		int numeroIngresado = 0;
		Scanner teclado = new Scanner(System.in);

		// solicito datos al usuario
		System.out.println("Ingrese por favor un numero comprendido entre 1 y 10 ");
		numeroIngresado = teclado.nextInt();

		if (numeroIngresado >= 1 && numeroIngresado <= 10) {

			switch (numeroIngresado) {

			case 1, 3, 5, 7, 9:
				System.out.println("El numero ingresado es impar");
				break;
			case 2, 4, 6, 8, 10:
				System.out.println("El numero ingresado es par");
				break;
			}

		} else {
			System.out.println("El numero " + numeroIngresado + " es incorrecto!");
		}

		teclado.close();
	}

}
