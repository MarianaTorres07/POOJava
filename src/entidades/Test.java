package entidades;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instancia de un empleado (que hereda de persona)
		System.out.println("Instancia de Empleado");
		Empleado EvilFelipe = new Empleado("EvilFelipe", 31, "evilfelipe@mail.com", "5511223344", "ABC123", "90876567389", "Bell boy");
		//Metodo de la Clase Empleado
		EvilFelipe.mostrarInformacion();
		
		//Con los 3 constructores
		System.out.println("Instancia de Empleado");
		Empleado Pikachu = new Empleado("Pikachu", 50, "AAA111", "12312312312", "Pokemon");
		//Metodo de la Clase Empleado 
		Pikachu.mostrarInformacion();
		
		//Con los 2 constructores
		System.out.println("Instancia de Empleado");
		Empleado EvilFelipe3 = new Empleado("EvilFelipe3", 31, "ABC123", "90876567389", "Bell boy");
		//Metodo de la Clase Empleado 
		EvilFelipe3.mostrarInformacion();
		
		//Instancia de una Persona 
		System.out.println("Instancia de Persona");
		Persona Naruto = new Persona("Naruto", 30, "naruto@gmail.com", "5533445555");
		Naruto.mostrarInformacion();
		
		System.out.println("Impresion de Objetos");
		System.out.println(EvilFelipe);
		
		//Instancia de un cliente
		System.out.println(); //espacio
		System.out.println("Instancia de un cliente");
		
		Cliente Jesus = new Cliente("Jesus Gonzalez","ABCD1234", 157.00f, "1234");
		Jesus.mostrarInfoCliente();
		
		//Modificacion de un atributo
		Jesus.nombre ="Evil Jesus";
		//Jesus.setSaldo(0.00f); //modificacion sin setter (error)
		Jesus.setCuentaBancaria("XYZ098");
		
		//Getter
		//Acceder la informacion privada
		//System.out.println(Jesus.saldo); //no se ve porque es privado
		
		//Acceder a informacion privada con getter
		System.out.println(Jesus.getCuentaBancaria());
		
		
		//Imprsion del objeto ya modifcado
		System.out.println(); //espacio
		Jesus.mostrarInfoCliente();
		


	}

}
