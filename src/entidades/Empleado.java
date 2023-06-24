/*
 * Herencia en la POO
 * 
 * Nos permite heredar atributos y metodos con la finalidad de reutilizar codigo y generar una relacion entre clases superiores(padres) y las subclases(hijos).
 * 
 * Superclase (clase superior) es la clase de quien vamos a heredar (persona)
 * Subclase (clase hijo) es donde vamos a poner lo que heredamos (empleado)
 * 
 * 
 * Para heredar, usamos una palabra reservada llamada extends. Esta palabra se coloca al lado del nombre de mi clase (Empleado), y despues definimos el lugar de donde nos vamoa a traer las cosas que queremos heredar (Persona). 
 * 
 * 
 * Para heredar constructors de una forma muy rapida, daremos click derecho sobre nuestro editor de codigo, desues buscaremos la opcion source y despues en la opcion de Generate Constructor using fields. En la segunda ventana, veremos la cantidad de constructores disponibles para heredar.
 * 
 * 
 * 
 * */


package entidades;

//Primero tengo que dar la instruccion de que quiero heredar
public class Empleado extends Persona {
	
	
	//1. Atributos o propiedades
	
	public String numEmpleado;
	public String nss;
	public String puesto;
	
	
	//2. Constructor con parametros (heredamos "la mitad" del constructor de Persona)
	//toma los parametros de la clase super, y los parametros de la subclase
	public Empleado(String nombre, int edad, String correo, String telefono, String numEmpleado, String nss,
			String puesto) {
		super(nombre, edad, correo, telefono); //nos indica que heredamos (esto es de la clase Superior) //Con la palabra super, evitamos repetir los .this
		this.numEmpleado = numEmpleado; //solo defino los .this que me hacen falta.
		this.nss = nss;
		this.puesto = puesto;
	}
	
	//Heredar construcores sobrecargados (3)
	public Empleado(String nombre, int edad, String correo, String numEmpleado, String nss, String puesto) {
		super(nombre, edad, correo);
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
	}
	
	//Heredar construcores sobrecargados (2)
	public Empleado(String nombre, int edad, String numEmpleado, String nss, String puesto) {
		super(nombre, edad);
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
	}

	//3.Metodos  (Para imprimirInformacion Empleado
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Correo: " + correo);
		System.out.println("Telefono: " + telefono);
		System.out.println("Numero Empleado: " + numEmpleado);
		System.out.println("Num Seguro Social: " + nss);
		System.out.println("puesto: " + puesto);
	} //cierre mostrarInformacion

	
	
	
	//4. toString
		//toString es un metodo en Java que proviene de la clase Objeto (el antecesor o precursor de todos los objetos que existen en Java. Este metodo ya se escribio, ya esta definido y nos permite mostrar la informacion del objeto en una cadena de texto.
	@Override
	public String toString() {
		return "Empleado [numEmpleado=" + numEmpleado + ", nss=" + nss + ", puesto=" + puesto + ", nombre=" + nombre
				+ ", edad=" + edad + ", correo=" + correo + ", telefono=" + telefono + "]";
	}
	
	

	

	
	

}
