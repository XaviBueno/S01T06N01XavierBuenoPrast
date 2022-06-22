package ex02;

public class AppGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1=new Persona("Josep","Garcia", 30);
		GenericMethods.llistaObjectes(persona1,"Hola",3);
		Persona persona2=new Persona("Ana","Martinez", 17);
		GenericMethods.llistaObjectes(10, persona2, "Casa");
	}
	
}
