package com.educacionit.clase5.ejerciciofor;

import java.util.Scanner;

//Leer 20 números e imprimir cuantos son positivos , 
//cuantos negativos y cuantos neutros
public class AppPrincipal {

	public static void main(String[] args) {
		System.out.println("Inicio de la app");

		Scanner teclado = new Scanner(System.in);
		int contadorPositivos = 0, contadorNegativos = 0, contadorNeutros = 0, numeroingresado = 0;

		// repetimos 20 veces el for
		for (int i = 1; i <= 20; i++) {
			// solicito el dato al user
			System.out.println("ingrese el numero " + i);
			numeroingresado = teclado.nextInt();
			// validamos si el numero ingresado es positivo , negativo o neutro
			if (numeroingresado > 0) {
				contadorPositivos++;
			} else if (numeroingresado < 0) {
				contadorNegativos++;
			} else {
				contadorNeutros++;
			}
		}

		System.out.println("de lo numeros ingresados ");
		System.out.println(contadorPositivos + " Son Positivos");
		System.out.println(contadorNegativos + " Son Negativos");
		System.out.println(contadorNeutros + " Son Neutros");

		teclado.close();
		System.out.println("Fin de la app");

	}

}
