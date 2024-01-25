package ejercicio02;

public abstract class Producto {
//id  precio  cantidad  nombre  vendido
	private int id;
	private double precioBase;
	private int cantidad;
	private String nombre;
	private boolean vendido;
	
	public Producto(int id, double precioBase, int cantidad, String nombre, boolean vendido) {
		this.id = id;
		this.precioBase = precioBase;
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.vendido=vendido;
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getPrecioBase() {
		return precioBase;
	}



	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public boolean isVendido() {
		return vendido;
	}



	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}



	public double calcularPVP(double porcentaje, double fijoDoble) {
		return precioBase;
	}
	
	
}
