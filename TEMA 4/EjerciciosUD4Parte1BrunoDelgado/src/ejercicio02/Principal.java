package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombreEmpresa = "Movistar",
				direccionEmpresa = "Calle Asunción 28 2Derecha",
				numContacto = "717770067",
				emailContacto = "brunodelher@gmail.com",
				fecha = "11/01/2024";
		
		
		Documento d = new Documento();
		
		TarjetaDeVisita t = new TarjetaDeVisita();
		
		Carta c = new Carta();
		
		System.out.println("Documento");
		
		System.out.println("***************");
		
		System.out.println(d.imprimirCabecera(nombreEmpresa, direccionEmpresa, numContacto, emailContacto, fecha));
		
		System.out.println("***************");
		
		System.out.println("Tarjeta de visita");
		
		System.out.println("***************");
		
		System.out.println(t.imprimirCabecera(nombreEmpresa, direccionEmpresa, numContacto, emailContacto, fecha));
		
		System.out.println("***************");
		
		System.out.println("Carta");
		
		System.out.println("***************");
		
		System.out.println(c.imprimirCabecera(nombreEmpresa, direccionEmpresa, numContacto, emailContacto, fecha));
		
		
		
	}

}
