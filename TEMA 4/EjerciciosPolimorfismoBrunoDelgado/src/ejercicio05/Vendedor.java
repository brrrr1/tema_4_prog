package ejercicio05;

public class Vendedor extends Empleado {
	
	private double cantidadDeVentas;
	private double incentivo;
	
	public Vendedor(String nombre, String apellidos, double sueldoBase, int numEmpleado, double cantidadDeVentas,
			double incentivo) {
		super(nombre, apellidos, sueldoBase, numEmpleado);
		this.cantidadDeVentas = cantidadDeVentas;
		this.incentivo = incentivo;
	}
	
	public double calcularSueldo() {
		double cien = 100;
		return super.calcularSueldo()+cantidadDeVentas*incentivo/cien;
	}

	public double getCantidadDeVentas() {
		return cantidadDeVentas;
	}

	public void setCantidadDeVentas(double cantidadDeVentas) {
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
			System.out.println("¡Felicidades! Eres un crack. ¿Un piquito?");
		}
	}
	
	

}
