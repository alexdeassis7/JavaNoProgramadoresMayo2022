package com.educacionit.metodos;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) { // metodo principal - algoritmos principal
		// Demo metodos
		Scanner teclado = new Scanner(System.in);

		System.out.println("ingrese el valor del producto ");
		double valoringresado = teclado.nextDouble();

		System.out.println("ingrese el porcetje del iva del producto ");
		double ivaIngresado = teclado.nextDouble();

		// invocamos a la funcion
		double valorRetornado = calcularIva(valoringresado, ivaIngresado);
		System.out.println("el iva del productos es : " + valorRetornado);

		// invocamos a nuestros procedimientos
		mostraMenu();
		enviarMail("alex@mail.com", "soy el mensaje del mail ");

		System.out.println("Fin de la app");
		teclado.close();
	}

	// defino mi primer funcion

	public static double calcularIva(double valor) {// valor es una variable local
		double porcentaje = 0.21;
		double resultado = valor * porcentaje;
		return resultado;// retornamos un dato de tipo double
	}

	public static double calcularIva(double valor, double porcentaje) {
		double resultado = valor * porcentaje;
		return resultado;// retornamos un dato de tipo double
	}

	// ejemplo de metodo del tipo procedimiento
	public static void mostraMenu() {

		System.out.println("Menu de opciones");

		System.out.println("1. alta cliente ");
		System.out.println("2. borrar cliente ");
		System.out.println("3. modificar cliente ");

	}

	// ejemplo de metodo del tipo procedimiento
	public static void enviarMail(String correo, String mensaje) {

		// todos la magia que envia el mail
		System.out.println("se envio el mail a la casilla " + correo + " con el mensaje: " + mensaje);

	}

}
