package ejercicio05;

public class Gerente extends Empleado{

	private double impuestos;

	public Gerente(String nombre, String apellidos, double sueldoBase, int numEmpleado, double impuestos) {
		super(nombre, apellidos, sueldoBase, numEmpleado);
		this.impuestos = impuestos;
	}
	
	public double calcularSueldo() {
		double cien = 100;
		return super.calcularSueldo()-super.calcularSueldo()*impuestos/cien;
	}
}
