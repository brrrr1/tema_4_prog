package ejemplo01V2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado e = new Empleado ("Luismi", "jefe", "12345678A", 2000.0, 15.0); 
		
		Trabajador t = new Trabajador ("Bruno", "limpiador", "523165060");
		
		Empleado e2 = new Empleado ("77777777C", 777777777, 15);
		
		Consultor c = new Consultor ("Eustaquio", "Jefazo", "1233567E", 41, 1.5);
		
		System.out.println(t);
		
		System.out.println(e);
		
		System.out.println(e2);
		
		System.out.println(t.calcularPaga());
		
		System.out.println(e.calcularPaga());
		
		System.out.println(e2.calcularPaga());
		
		System.out.println(c.calcularPaga());
		
		System.out.println("***************************");
		
		System.out.println();
		
		c.avisarExtras();
		
		System.out.println();
		
		System.out.println("***************************");
		
		System.out.println();
		
		t.darDeBaja();
		
		System.out.println(t);
		
		e.darDeBaja();
		
		System.out.println(e);
		
		System.out.println();
		
		System.out.println("***************************");
		
		
	}

}
