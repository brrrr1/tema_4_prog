package ejercicio05;

public class Vendedor extends Empleado {
	
	private int cantidadDeVentas;
	private double incentivo;
	
	public Vendedor(String nombre, String apellidos, double sueldoBase, int numEmpleado, int cantidadDeVentas,
			double incentivo) {
		super(nombre, apellidos, sueldoBase, numEmpleado);
		this.cantidadDeVentas = cantidadDeVentas;
		this.incentivo = incentivo;
	}
	
	public double calcularSueldo() {
		double cien = 100;
		return super.calcularSueldo()+cantidadDeVentas*incentivo/cien;
	}

	public int getCantidadDeVentas() {
		return cantidadDeVentas;
	}

	public void setCantidadDeVentas(int cantidadDeVentas) {
		this.cantidadDeVentas = cantidadDeVentas;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	

	public void felicitacion (int objetivoVentas) {
		if(objetivoVentas<cantidadDeVentas) {
			System.out.println("¡Felicidades! Eres un crack.");
		}
	}
	
	

}
