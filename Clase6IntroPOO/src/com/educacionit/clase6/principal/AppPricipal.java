package com.educacionit.clase6.principal;

import java.util.Scanner;

import com.educacionit.clase6.Persona; //importo la clase a utilizar

public class AppPricipal {

	public static void main(String[] args) {

		// instanciamos objetos de la clase Persona ;

		// llamamos al constructor con todos los parametros

		Persona rodrigo = new Persona("Rodri", 29, 1.78f, 39456555l, "callao 559", "Ramos");

		// metodo constructor con dos los parametros de tipo string
		Persona melisa = new Persona("Meli", "Haller");

		Persona german = new Persona();// llamando al constructor vacio

		Persona alex = new Persona("alex", 36868966);

		System.out.println("rodrigo " + rodrigo);
		System.out.println("alex " + alex);
		// accedo a los atributos publicos del objeto rodrigo
//		System.out.println("edad: " + rodrigo.edad);
//		System.out.println("nombre: " + rodrigo.nombre);
//		System.out.println("altura: " + rodrigo.altura);
//		System.out.println("dni: " + rodrigo.dni);
//		System.out.println("domicilio: " + rodrigo.domicilio);
//		System.out.println("apellido: " + rodrigo.apellido);

		System.out.println("melisa " + melisa);

		// invoco al metodo toString implementado en la clase Persona
		System.out.println("melisa ToString " + melisa.toString());

		System.out.println("german " + german);

		// modificamos el estado de los atributos de rodrigo
//		rodrigo.nombre = "Rodri";
//		rodrigo.edad = 29;
//		rodrigo.altura = 1.78f;
//		rodrigo.dni = 39456555;
//		rodrigo.domicilio = "callao 559";
//		rodrigo.apellido = "Ramos";

		// modificamos el estado de los atributos de melisa
//		melisa.nombre = "Meli";
//		melisa.edad = 26;
//		melisa.altura = 1.71f;
//		melisa.dni = 38222333;
//		melisa.domicilio = "Av. Cordoba 123";
//		melisa.apellido = "Haller";

		// modificamos el estado de los atributos de german
//		german.nombre = "German";
//		german.edad = 31;
//		german.altura = 1.89f;
//		german.dni = 41555999;
//		german.domicilio = "pelegrini 12";
//		german.apellido = "Suárez";

		System.out.println("rodrigo " + rodrigo);
		System.out.println("melisa " + melisa);
		System.out.println("german " + german);

		Scanner teclado = new Scanner(System.in);
		System.out.println("ingrese la edad por favor ");
		int edad = teclado.nextInt();

		System.out.println("ingrese el DNI por favor ");
		int dni = teclado.nextInt();

		Persona p1 = new Persona();
		// encapsulamiento
		// llamamos a los metodos get / set
		p1.setEdad(edad);
		p1.setDni(dni);

		System.out.println(p1);

		teclado.close();

	}

}
