package com.educacionit.clase4;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		// sintaxis mientras

		// mostrame los numeros del 0 al 100
		int contador = 0;

		System.out.println("Inicio del while");
		while (contador <= 100) {
			// cuerpo del while
			System.out.println(contador);
			contador++; // operador auto incremetal ++
		}
		System.out.println("Fin del while");

		// mostrame los numeros del 100 al 0
		contador = 100;
		System.out.println("Inicio del segundo while");
		while (contador >= 0) {
			// cuerpo del while
			System.out.println(contador);
			contador--; // operador auto decrecremetal ++
		}

		System.out.println("Fin del segundo while");

	}

}
