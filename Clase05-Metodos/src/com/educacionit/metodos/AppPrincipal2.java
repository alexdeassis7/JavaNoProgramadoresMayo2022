package com.educacionit.metodos;

import java.util.Scanner;

/**
 * Calcular el promedio de tres notas de una alumno y la condicion final (si
 * aprobo o no ) , aprueba con promedio mayor o igual a 7 , caso contrari
 * reprueba lo descomponemos en sub problemas
 */
// 1- entrada de datos (nota 1 , nota 2 , nota 3)
// 2- calculo del promedio
// 3- calculo de la condicion de alumno 
// 4- salida de resultados 

public class AppPrincipal2 {
//variables globales : es una variable que se puede utilizar dentro de todos los metodos 
	static Scanner teclado = new Scanner(System.in);
	static float nota1 = 0, nota2 = 0, nota3 = 0, promedio = 0;
	static String condicionalumno = "";

	public static void main(String[] args) {
		System.out.println("Inicio de la app");
		// invocamos a los metodos desde el algoritmos principal
		solicitarDatos();
		calcularPromedio();
		validarCondicion();
		mostrarResultados();

		System.out.println("Fin de la app");
	}

	// entrada de datos (nota 1 , nota 2 , nota 3)
	public static void solicitarDatos() {
		System.out.println("ingrese la nota 1");
		nota1 = teclado.nextFloat();
		System.out.println("ingrese la nota 2");
		nota2 = teclado.nextFloat();
		System.out.println("ingrese la nota 3");
		nota3 = teclado.nextFloat();
//		ctrl  + shift + f = identado
	}

//	2- calculo del promedio
	public static void calcularPromedio() {
		promedio = (nota1 + nota2 + nota3) / 3;
	}

//	3- calculo de la condicion de alumno 
	public static void validarCondicion() {
		if (promedio >= 7) {
			condicionalumno = "Aprobado";
		} else {
			condicionalumno = "Desaprobado";
		}
	}

	// 4- salida de resultados
	public static void mostrarResultados() {
		System.out.println("Las notas del Alumno son : " + nota1 + " - " + nota2 + " - " + nota3);
		System.out.println("El promedio del Alumno es : " + promedio);
		System.out.println("La condicion del alumno es : " + condicionalumno);
	}

}
