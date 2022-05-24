package com.educacionit.clase4;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// Condicional Multiple:
		/**
		 * Esta estructura es utilizada cuando se debe elegir entra mas de dos
		 * alternativas de acuerdo con el valor de una variable . Evalúa un expresión
		 * que puede resultar en N valores distintos , Según el resultado de la
		 * Expresión , se ejecutaran las sentencias definidas para el valor que se ha
		 * obtenido
		 */

		// Ejercicio Demo
		/**
		 * desarrollar un algoritmo que permita ingresar un número entero comprendido
		 * entre 1 y 7 , y que muestre por pantalla el dia de la semana al que se
		 * corresponde
		 */

		int numeroIngresado = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("por favor ingrese un numero entre 1 y 7 ");
		numeroIngresado = teclado.nextInt();

		switch (numeroIngresado) {

		case 1:
			System.out.println("usted ingreso el 1 Domingo");
			break;
		case 2:
			System.out.println("usted ingreso el 2 lunes");
			break;
		case 3:
			System.out.println("usted ingreso el 3 Martes");
			break;
		case 4:
			System.out.println("usted ingreso el 4 Miercoles");
			break;
		case 5:
			System.out.println("usted ingreso el 5 Jueves");
			break;
		case 6:
			System.out.println("usted ingreso el 6 Viernes");
			break;
		case 7:
			System.out.println("usted ingreso el 7 Sabado");
			break;

		default:
			// se ejecutara el bloque de codigo del default si solo si no se ingreso a
			// ningun case previo
			System.out.println(
					"el numero ingresado " + numeroIngresado + " no se corresponde a ningun dia de la semana ");
			break;
		}

		System.out.println("Finalizo la APP");
		teclado.close();
	}
}
