package entidades;

//Primero tengo que dar la instruccion de que quiero heredar
public class Empleado extends Persona {
	
	
	//1. Atributos o propiedades
	
	public String numEmpleado;
	public String nss;
	public String puesto;
	
	
	//2. Constructor con parametros (heredamos "la mitad" del constructor de Persona)
	public Empleado(String nombre, int edad, String correo, String telefono, String numEmpleado, String nss,
			String puesto) {
		super(nombre, edad, correo, telefono); //nos indica que heredamos (esto es de la clase Superior)
		this.numEmpleado = numEmpleado;
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

	

	
	

}
