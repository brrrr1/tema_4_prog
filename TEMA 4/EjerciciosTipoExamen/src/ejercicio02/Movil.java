package ejercicio02;

public class Movil extends Producto{

	private String marca;

	public Movil(int id, double precioBase, int cantidad, String nombre, String marca, boolean vendido) {
		super(id, precioBase, cantidad, nombre, vendido);
		this.marca = marca;
	}
	
	public double calcularPVP(double porcentaje, double fijoDoble) {
		return super.calcularPVP(porcentaje, fijoDoble)+super.calcularPVP(porcentaje, fijoDoble);
	}
}
