package com.educacionit.clase4;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		// calcular el mayo de dos numeros
		int numero1 = 0, numero2 = 0, mayor = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("ingresa el numero 1");
		numero1 = teclado.nextInt();

		System.out.println("ingresa el numero 2");
		numero2 = teclado.nextInt();
		//if else "clasico" 
//		if (numero1 > numero2) {
//			mayor = numero1;
//		} else {
//			mayor = numero2;
//		}

		// operador ternario o if else inline
		//resultado = (condicion) ? true : false ;
		mayor = (numero1 > numero2) ? numero1 : numero2 ; 
		
		
		
		System.out.println("el mayor de los dos numeros es " + mayor);


		
	
	}

}
