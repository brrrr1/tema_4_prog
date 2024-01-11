package ejercicio01;

public class Portatil extends Ordenador{
	
	private boolean seguro;
	private double precioSeguro;
	public Portatil(double capacidad, double frecuenciaCPU, double precioBase, String marca, int id, boolean seguro,
			double precioSeguro) {
		super(capacidad, frecuenciaCPU, precioBase, marca, id);
		this.seguro = seguro;
		this.precioSeguro = precioSeguro;
	}
	
	public double calcularPVP (double porcentaje) {
		if(seguro) {
		return super.calcularPVP(porcentaje)+precioSeguro;
	}
		else return super.calcularPVP(porcentaje);
	}

	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}

	public double getPrecioSeguro() {
		return precioSeguro;
	}

	public void setPrecioSeguro(double precioSeguro) {
		this.precioSeguro = precioSeguro;
	}

	@Override
	public String toString() {
		return super.toString() + "Portatil [seguro=" + seguro + ", precioSeguro=" + precioSeguro + "]";
	}

	
}
