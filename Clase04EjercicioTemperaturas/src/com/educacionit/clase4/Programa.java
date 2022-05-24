package com.educacionit.clase4;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// calcular el promedio de las temperaturas maximas del mes de Mayo
		float temperaturaMaxima = 0, promedio = 0, sumatoriaTemperaturas = 0;
		final int CANTIDAD_DE_DIAS = 31;
		int contador = 1;
		Scanner teclado = new Scanner(System.in);

		while (contador <= CANTIDAD_DE_DIAS) {

			System.out.println("Ingrese la temperatura del dia " + contador);
			temperaturaMaxima = teclado.nextFloat();
			// sumatoriaTemperaturas = sumatoriaTemperaturas + temperaturaMaxima;
			sumatoriaTemperaturas += temperaturaMaxima;
			
			contador++;
		}

		promedio = sumatoriaTemperaturas / CANTIDAD_DE_DIAS;

		System.out.println("El promedio de las temperaturas maximas de Mayo del 2022 fue de " + promedio);

		teclado.close();

	}

}
