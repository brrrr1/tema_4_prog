package ejercicio02;

public class Carta extends Documento {
	
	public Carta() {		
	}
	
	public String imprimirCabecera(String nombreEmpresa, String direccionEmpresa, String numContacto, String emailContacto, String fecha) {
		return super.imprimirCabecera(nombreEmpresa, direccionEmpresa, numContacto, emailContacto, fecha)+"\n"+fecha;
	}

}
