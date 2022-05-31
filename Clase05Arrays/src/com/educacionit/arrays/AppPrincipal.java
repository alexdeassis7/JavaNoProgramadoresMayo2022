package com.educacionit.arrays;

public class AppPrincipal {

	public static void main(String[] args) {
		// definimos e inicializamos un array de 10 elementos
		// int vector[] = new int[10];

		int vector[];
		vector = new int[10];
		
		// recorremos el vector con un for
		for (int i = 0; i < vector.length; i++) {
			System.out.println("vector [" + i + "]=" + vector[i]);
		}
		
		vector[25]=444;
		
		
		System.out.println("***********************");
		// inicializamos un vector con valores
		int array[] = { 1, 2, 3, 4, 5, 66, 77, 55, 44, 22, 3 };
		// recorremos el vector con un for
		for (int i = 0; i < array.length; i++) {
			System.out.println("vector [" + i + "]=" + array[i]);
		}
		
		

	}

}
