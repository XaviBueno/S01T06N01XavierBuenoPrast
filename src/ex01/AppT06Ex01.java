package ex01;

public class AppT06Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cotxe cotxe1=new Cotxe("Ford", "Focus",90);
		Cotxe cotxe2=new Cotxe("Seat", "Leon",125);
		Cotxe cotxe3=new Cotxe("Audi", "A4",180);
		
		NoGenericMethods cotxes1=new NoGenericMethods(cotxe1,cotxe2,cotxe3);
		System.out.println(cotxes1.getObj1().toString());
		System.out.println(cotxes1.getObj2().toString());
		System.out.println(cotxes1.getObj3().toString());
		NoGenericMethods cotxes2=new NoGenericMethods(cotxe2,cotxe2,cotxe3);
		System.out.println(cotxes2.getObj1().toString());
		System.out.println(cotxes2.getObj2().toString());
		System.out.println(cotxes2.getObj3().toString());
		NoGenericMethods cotxes3=new NoGenericMethods(cotxe1,cotxe3,cotxe2);
		System.out.println(cotxes3.getObj1().toString());
		System.out.println(cotxes3.getObj2().toString());
		System.out.println(cotxes3.getObj3().toString());
				;
		
		
	}

}
