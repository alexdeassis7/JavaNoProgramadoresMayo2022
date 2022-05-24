package com.educacionit.clase4;

import java.util.Scanner;

public class Programa {
//2)	Leer 10 números y obtener su cubo y su cuarta
	public static void main(String[] args) {

		int contador = 1, numeroIngresado = 0, cubo = 0, cuarta = 0;
		Scanner teclado = new Scanner(System.in);

		while (contador <= 10) {

			System.out.println("Ingrese el numero " + contador);
			numeroIngresado = teclado.nextInt();

			cubo = numeroIngresado * numeroIngresado * numeroIngresado;
			cuarta = cubo * numeroIngresado;

			System.out.println("Cubo de " + numeroIngresado + " es " + cubo);

			System.out.println("Cuarta de " + numeroIngresado + " es " + cuarta);

			contador++;
		}

		teclado.close();
	}

}
