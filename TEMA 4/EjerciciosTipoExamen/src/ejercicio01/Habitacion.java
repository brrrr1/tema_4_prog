package ejercicio01;

public class Habitacion {

	private int id;
	private double precioBase;
	private boolean ocupada;
	private String nombreCliente;
	private int diasOcupada;
	private int ocupantes;
	

	
	public Habitacion(int id, double precioBase, boolean ocupada, String nombreCliente, int diasOcupada, int ocupantes) {
		this.id=id;
		this.precioBase = precioBase;
		this.ocupada = ocupada;
		this.nombreCliente = nombreCliente;
		this.diasOcupada = diasOcupada;
		this.ocupantes = ocupantes;
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

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getDiasOcupada() {
		return diasOcupada;
	}

	public void setDiasOcupada(int diasOcupada) {
		this.diasOcupada = diasOcupada;
	}

	public int getOcupantes() {
		return ocupantes;
	}

	public void setOcupantes(int ocupantes) {
		this.ocupantes = ocupantes;
	}

	
	public double calcularPrecio(double descuento) {
		return precioBase*diasOcupada;
	}
	
}
