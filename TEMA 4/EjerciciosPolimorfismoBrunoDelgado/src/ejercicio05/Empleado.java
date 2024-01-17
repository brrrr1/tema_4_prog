package ejercicio05;

public class Empleado {
	
	private String nombre;
	private String apellidos;
	private double sueldoBase;
	private int numEmpleado;
	public Empleado(String nombre, String apellidos, double sueldoBase, int numEmpleado) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldoBase = sueldoBase;
		this.numEmpleado = numEmpleado;
	}
	
	public double calcularSueldo() {
		return sueldoBase;
	}

}
