package com.educacionit.clase6;

//Clase : Template para instanciar los objetos
public class Persona {

	// Atributos: define las caracteristicas de la clase
	private String nombre;
	private int edad;
	private float altura;
	private long dni;
	private String domicilio;
	private String apellido;

	// inicializador de bloque : SE EJECUTA ANTES DEL LLAMADO A CUALQUIER
	// CONSTRUCTOR
	{
		System.out.println("Soy el bloque inicializador");
		System.out.println("Creando una persona desde el constructor");
	}

	// metodo constructor : Siempre tienen el mismo nombre que la clase

	// defino explicitamente el constructor vacio
	public Persona() {
	}

	// defino metodo constructor con todos los parametros
	public Persona(String nombre, int edad, float altura, long dni, String domicilio, String apellido) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.dni = dni;
		this.domicilio = domicilio;
		this.apellido = apellido;
	}

	// defino metodo constructor con dos los parametros de tipo string
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Persona(String nombre, long dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public Persona(int edad, long dni) {
		this.edad = edad;
		this.dni = dni;
	}

	// getter (funcion) y setter (procedimiento)
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad <= 0) {
			System.out.println("Error no podemos tener una edad menor o igual a cero");
		} else {
			System.out.println("La edad ya fue Seteada");
			this.edad = edad;
		}

	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		if (dni <= 0) {
			System.out.println("Error no podemos tener un DNI menor o igual a cero");
		} else {
			System.out.println("El DNI ya fue Seteado");
			this.dni = dni;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	// metodos : definene el comportamiento de la clase
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", dni=" + dni + ", domicilio="
				+ domicilio + ", apellido=" + apellido + "]";
	}

}
