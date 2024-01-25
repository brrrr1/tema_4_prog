package ejercicio01;

public class Apartamento extends Habitacion{

	private boolean limpiezaContratada;
	private double costoLimpieza;
	
	public Apartamento(int id, double precioBase, boolean ocupada, String nombreCliente, int diasOupada, int ocupantes,
			boolean limpiezaContratada, double costoLimpieza) {
		super(id, precioBase, ocupada, nombreCliente, diasOupada, ocupantes);
		this.limpiezaContratada = limpiezaContratada;
		this.costoLimpieza = costoLimpieza;
	}
	public boolean isLimpiezaContratada() {
		return limpiezaContratada;
	}
	public void setLimpiezaContratada(boolean limpiezaContratada) {
		this.limpiezaContratada = limpiezaContratada;
	}
	public double getCostoLimpieza() {
		return costoLimpieza;
	}
	public void setCostoLimpieza(double costoLimpieza) {
		this.costoLimpieza = costoLimpieza;
	}
	
	public double calcularPrecio(double descuento) {
		if(limpiezaContratada) {
			return super.calcularPrecio(descuento)+costoLimpieza*super.getDiasOcupada();
		}else {
			return super.calcularPrecio(descuento);
		}
	}
}
