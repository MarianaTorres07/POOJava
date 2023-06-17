package entidades;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instancia de un empleado (que hereda de persona)
		Empleado EvilFelipe = new Empleado("EvilFelipe", 31, "evilfelipe@mail.com", "5511223344", "ABC123", "90876567389", "Bell boy");
		//Metodo de la Clase Empleado
		EvilFelipe.mostrarInformacion();
		
		//Con los 3 constructores
		Empleado EvilFelipe2 = new Empleado("EvilFelipe2", 31, "evilfelipe@mail.com", "ABC123", "90876567389", "Bell boy");
		//Metodo de la Clase Empleado 
		EvilFelipe2.mostrarInformacion();
		
		//Con los 2 constructores
		Empleado EvilFelipe3 = new Empleado("EvilFelipe2", 31, "ABC123", "90876567389", "Bell boy");
		//Metodo de la Clase Empleado 
		EvilFelipe3.mostrarInformacion();


	}

}
