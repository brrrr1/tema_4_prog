package ejercicio02;

public class EspadaLaser extends Producto {

	private String tipo;
	private double fijoDoble;

	
	
	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public double getFijoDoble() {
		return fijoDoble;
	}



	public void setFijoDoble(double fijoDoble) {
		this.fijoDoble = fijoDoble;
	}



	public EspadaLaser(int id, double precioBase, int cantidad, String nombre, boolean vendido, String tipo,
			double fijoDoble) {
		super(id, precioBase, cantidad, nombre, vendido);
		this.tipo = tipo;
		this.fijoDoble = fijoDoble;
	}



	public double calcularPVP(double porcentaje, double fijoDoble) {
		int cien = 100;
		return super.calcularPVP(porcentaje, fijoDoble)+super.calcularPVP(porcentaje, fijoDoble)*porcentaje/cien+fijoDoble;
	}
	
	public void avisoEspadaDoble() {
		String tipoComparar = "Doble";
		if(tipo==tipoComparar) {
			System.out.print("¡Cuidadín al sacarla de la bolsa, que hace pupa!\n");
		}
		
	}
}
