/*
 * Notas para trabajar con POO en JAVA
 * 
 * Establecemos los pasos para trabajar con nuestras clases, definiendo el siguiente orden:
 * 
 * 	-Primero nuestras propiedades o atributs usando variables de JAVA
 * 	-Definimos un constructor con parametros(este constructor se define en la clase).
 * Tambien tenemos un constructor llamado "constructor por defecto", que se define en la instancia de la clase. El inconveniente que tenemos es que solo podemos usar uno de los dos. 
 * 
 * -Por ultimo, definimos los metodos que nuestro objeto va a utilizar. Aqui utilizamos la teoria de funciones (funciones vacias, funciones que retornar un tipo de valor). 
 * 
 * Notas adicionales
 * 
 * Sobrecarga de metodos.
 * 
 * La finalidad de la sobrecarga de metodos es utilizar el mismo nombre del metodo (Persona) e ir variando sus parametros. Con esto evitamos usar "Persona1", "Persona2", etc. para utilizar el mismo metodo en diferentes situaciones. 
 * 
 * Hay que recordar que los datos generalmente vinenen del front (formulario). La sobrecarga nos ayuda en comprender distintas situaciones donde tal vez uno de los campos solicitados en el frmulario no sea requierido u obligatorio de llenar. Utilizando la sobrecarga, evitamos qe el dato se asigne incorrectamente (es decir, que quede como indefinido), ya que esto podria acarrear errores en la ejecución de nuestro codigo. De preferencia, es mejor que el dato quede como nulo. 
 * 
 * */

package entidades;

public class Persona {
	
			//1. Propiedades o Atributos
			public String nombre; //null
			public int edad;  //null
			public String correo; //null
			public String telefono;  //null
			
			
			//2. Constructor (con 4 parametros)
			public Persona(String nombre, int edad, String correo, String telefono) {
				this.nombre = nombre;
				this.edad = edad;
				this.correo = correo;
				this.telefono = telefono;
			} //cierre de constructor
			
			//Sobrecarga de metodo (overleading) constructor con 3
			public Persona(String nombre, int edad, String correo) {
				this.nombre = nombre;
				this.edad = edad;
				this.correo = correo;
			}
			
			//Sobrecarga de metodo (overleading) constructor con 2
			public Persona(String nombre, int edad) {
				this.nombre = nombre;
				this.edad = edad;
			}
			
			
			//3.Metodos 
			public void mostrarInformacion() {
				System.out.println("Nombre: " + nombre);
				System.out.println("Edad: " + edad);
				System.out.println("Correo: " + correo);
				System.out.println("Telefono: " + telefono);
			} //cierre mostrarInformacion
			
			
			//Metodo para convertir dolares a pesos (funcion que retorna flotantes
			public float conversor(float conversionDolar) {
				float dolar = 16.50f;
				float conversion = dolar * conversionDolar;
				System.out.println(conversion);
				return conversion;
			} //cierre de conversor
			 
			
	//Metodo main es una funcion "ejecutora"		
	public static void main(String[] args) {
		
		//Instancia de un objeto Persona
		Persona Felipe = new Persona ("Felipe", 31, "felipe.maqueda@idr.mx", "5512345678");
		Persona Mariana = new Persona ("Mariana", 24, "martorres612@gmail.com", "98312345678");
		Persona Jose = new Persona ("Jose", 32, "joealbert@gmail.com", "5512345456");
		Persona Valeria = new Persona ("Valeria", 26, "valeria.rodriguez@gmail.com", "5515645678");
		Persona Sofia = new Persona ("Sofia", 27, "sofiaOrtiz@gmail.com", "5523345678");
		
		//Uso del metodo mostrarInformacion que pertenece al objeto Felipe
		Felipe.mostrarInformacion();
		
		//Uso del metodo mostrarInformacion que pertenece al objeto Mariana
		Mariana.mostrarInformacion();
		
		//Uso del metodo mostrarInformacion que pertenece al objeto Jose
		Jose.mostrarInformacion();
		
		//Uso del metodo mostrarInformacion que pertenece al objeto Valeria
		Valeria.mostrarInformacion();
		
		//Uso del metodo mostrarInformacion que pertenece al objeto Sofia
		Sofia.mostrarInformacion();
		
		//conversor(15,69f);
		
		//Instanciar con segundo constructor
		//Si no respetamos numero de parametros, orden de los datos o tipo de datos, tendremos errores para instanciar nuestros objetos. 
		Persona Mariana2 = new Persona("Mariana", 19, "mariana@gmail.com");
		
		Persona Fernanda = new Persona("Fernanda", 20);
		
		Mariana2.mostrarInformacion();
		Fernanda.mostrarInformacion();
		
		//Podemos definir primero nuestros objetos, y despues crear nuestros constructorea
		//Persona Jesus = new Persona("Jesus", "Maqueda", 31, 1.80f, 150.67f,"felipe@gmail.com");
		
		//No se puede instanciar porque no hay consctructor con un solo parametro
		//Persona Narut = new Persona ("Naruto");
		
		
								
	}

}
