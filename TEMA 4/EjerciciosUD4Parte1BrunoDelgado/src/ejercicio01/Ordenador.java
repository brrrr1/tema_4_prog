package ejercicio01;

public class Ordenador {


	private double capacidad;
	private double frecuenciaCPU;
	private double precioBase;
	private String marca;
	private int id;
	
	public Ordenador(double capacidad, double frecuenciaCPU, double precioBase, String marca, int id) {
		this.capacidad = capacidad;
		this.frecuenciaCPU = frecuenciaCPU;
		this.precioBase = precioBase;
		this.marca = marca;
		this.id = id;
		
		
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public double getFrecuenciaCPU() {
		return frecuenciaCPU;
	}

	public void setFrecuenciaCPU(double frecuenciaCPU) {
		this.frecuenciaCPU = frecuenciaCPU;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Ordenador [capacidad=" + capacidad + ", frecuenciaCPU=" + frecuenciaCPU + ", precioBase=" + precioBase
				+ ", marca=" + marca + ", id=" + id + "]";
	}
	
	public double calcularPVP (double porcentaje) {
		double cien = 100;
		double resultado = precioBase+precioBase*porcentaje/cien;
		return resultado;
	}
	
}


