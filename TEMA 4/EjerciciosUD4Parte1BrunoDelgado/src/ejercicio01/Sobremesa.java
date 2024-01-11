package ejercicio01;

public class Sobremesa extends Ordenador {

	private double precioMontaje;

	public Sobremesa(double capacidad, double frecuenciaCPU, double precioBase, String marca, int id,
			double precioMontaje) {
		super(capacidad, frecuenciaCPU, precioBase, marca, id);
		this.precioMontaje = precioMontaje;
	}
		
		public double calcularPVP (double porcentaje) {
			return super.calcularPVP(porcentaje)+precioMontaje;
		}

		public double getPrecioMontaje() {
			return precioMontaje;
		}

		public void setPrecioMontaje(double precioMontaje) {
			this.precioMontaje = precioMontaje;
		}

		@Override
		public String toString() {
			return super.toString() + "Sobremesa [precioMontaje=" + precioMontaje + "]";
		}
	
	

	
	
}
