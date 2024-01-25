package ejercicio01;

public class Suite extends Habitacion {

	private double metrosC;
	private double dineroServicio;
	
	public Suite(int id, double precioBase, boolean ocupada, String nombreCliente, int diasOupada, int ocupantes,
			double metrosC, double dineroServicio) {
		super(id, precioBase, ocupada, nombreCliente, diasOupada, ocupantes);
		this.metrosC = metrosC;
		this.dineroServicio = dineroServicio;
	}

	public double getMetrosC() {
		return metrosC;
	}

	public void setMetrosC(double metrosC) {
		this.metrosC = metrosC;
	}

	public double getDineroServicio() {
		return dineroServicio;
	}

	public void setDineroServicio(double dineroServicio) {
		this.dineroServicio = dineroServicio;
	}
	
	public double calcularPrecio(double descuento) {
		double cien = 100;
		return super.calcularPrecio(descuento)+dineroServicio-(super.calcularPrecio(descuento)+dineroServicio)*descuento/cien;
	}
}
