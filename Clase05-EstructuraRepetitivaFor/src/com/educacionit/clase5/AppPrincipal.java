package com.educacionit.clase5;

public class AppPrincipal {
                //DEBUG : ejecucion paso a paso de la app 
	
	public static void main(String[] args) {
		// estructura repetitiva for :

		System.out.println("mostramos los numeros del 0 al 100");
		// mostrar los numeros del 0 al cien
//		for (declaracion del indice ; condicion      ; incremento o decremento del indice) { 
		for (int i = 0; i <= 100; i++) { // i++ analogo a i= i + 1;
			// cuerpo del for
			// i = indice (se incrementa o decrementa en forma automatica al finalizar cada
			// ciclo )
			System.out.println(i);
		}
		System.out.println("ya se mostraron los numeros del 0 al 100");

		System.out.println("********** mostrar los numeros pares del 0 al cien");

		for (int i = 0; i <= 100; i += 2) {
			System.out.println(i);
		}
		System.out.println("********* ya se mostraron los numeros pares del 0 al 100");

		System.out.println("mostramos los numeros del 100 al 0");
		for (int i = 100; i >= 0; i--) {
			// cuerpo del for
			System.out.println(i);
		}

		System.out.println("Fin de la app");
	}

}
