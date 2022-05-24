package com.educacionit.clase4;

import java.util.Scanner;

/*enunciado :
4) Calcular la utilidad que un trabajador recibe en el reparto anual 
de utilidades si este se le asigna como un porcentaje de su salario 
mensual que depende de su antigüedad en la empresa de acuerdo con la 
siguiente tabla

	Tiempo	                              Utilidad
	Menos de 1 año						5% del salario
	1 año o más y menos de 2 años 		7% del salario
	2 años o más y menos de 5 años		10% del salario
	5 años o más y menos de 10 años		15% del salario
	10 años o mas 						20% del salario*/

public class Programa {

	public static void main(String[] args) {
//		condicionales anidados 

		// variables de trabajo
		float antiguedad = 0, salario = 0, utilidad = 0;

		Scanner teclado = new Scanner(System.in);

		// solicitamos lo0s datos al usuario
		System.out.println("Ingrese por favor su antiguedad en la empresa");
		antiguedad = teclado.nextFloat();

		System.out.println("Ingrese por favor su salario mensual en la empresa");
		salario = teclado.nextFloat();

		if (antiguedad < 1) {// la primer condicion de un if-else anidado debera ser la que mayor
								// probabilidad tiene de ser true
			// cuerpo del if
			utilidad = salario * 0.05f;// Menos de 1 año 5% del salario
		} else if (antiguedad >= 1 && antiguedad < 2) {
			// cuerpo del if
			utilidad = salario * 0.07f;// 1 año o más y menos de 2 años 7% del salario
		} else if (antiguedad >= 2 && antiguedad < 5) {
			// cuerpo del if
			utilidad = salario * 0.10f;// 2 años o más y menos de 5 años 10% del salario
		} else if (antiguedad >= 5 && antiguedad < 10) {
			// cuerpo del if
			utilidad = salario * 0.15f;// 5 años o más y menos de 10 años 15% del salario
		} else {
			// cuerpo del if
			utilidad = salario * 0.20f;// 10 años o mas 20% del salario*/
		}

		System.out.println("Usted trabajo " + antiguedad + " anios en la empresa ");
		System.out.println("y su utilidad sera de " + utilidad + " pesos");

		
	}

}
