package ejercicio02;

public class TarjetaDeVisita extends Documento {

	public TarjetaDeVisita() {
	}
	
	public String imprimirCabecera(String nombreEmpresa, String direccionEmpresa, String numContacto, String emailContacto, String fecha) {
		return super.imprimirCabecera(nombreEmpresa, direccionEmpresa, numContacto, emailContacto, fecha)+"\n"+numContacto+"\n"+emailContacto;
	}
	
	
}
