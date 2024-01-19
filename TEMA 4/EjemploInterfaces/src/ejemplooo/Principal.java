package ejemplooo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Animal ("Doble elefante telepata de guerra", 4);
		Persona p = new Persona ("Luismi", 33);
		
		Alumno alum = new Alumno ("Brrrr", 18, 10.0);
		
		a.localizar(a);
		a.cazar(a);
		
		p.localizar(a);
		p.cazar(a);
		
		a.huir();
		
		
		
		
	}

}
