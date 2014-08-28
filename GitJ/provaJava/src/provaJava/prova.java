package provaJava;

import org.omg.CORBA.Environment;

public class prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ciao");
		
	
		clsPersona Person = new clsPersona();
		Person.setCognome("Raseni");
		Person.setNome("Renzo");
		
		Person.str();
		
		System.out.println(Person.getCognome());
		
		System.out.println(System.getenv("USERNAME"));
		
		
	}

}
