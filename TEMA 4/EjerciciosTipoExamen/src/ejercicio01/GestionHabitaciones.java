package ejercicio01;

public class GestionHabitaciones {

	private Habitacion[]habitaciones;

	public GestionHabitaciones(Habitacion[] habitaciones) {
		super();
		this.habitaciones = habitaciones;
	}

	public Habitacion[] getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(Habitacion[] habitaciones) {
		this.habitaciones = habitaciones;
	}
	
	public double calcularPrecioFinal(Habitacion h, double descuento) {
		return h.calcularPrecio(descuento);
	}
	
	public Habitacion findById(int id, int tam) {
		boolean encontrado = false;
		int i = 0;
		while(i<tam && !encontrado) {
			if(habitaciones[i].getId()==id) {
				encontrado = true;
			}else {
				i++;
			}
		}
		if(encontrado) {
			return habitaciones[i];
		}else {
			return null;
		}
	}
	
	public double calcularTotalRecaudado(double descuento) {
		double resultado = 0;
		for (int i = 0; i < habitaciones.length; i++) {
			resultado = resultado + habitaciones[i].calcularPrecio(descuento);
		}
		return resultado;
	}
	
	public void mostrarNoOcupadas() {
		for (int i = 0; i < habitaciones.length; i++) {
			if(habitaciones[i].isOcupada()) {
				
			}else {
				System.out.println(habitaciones[i]);
			}
		}
	}
	
	public void imprimirFactura(Habitacion h, double descuento) {
		//id  precioBase  ocupada  nombreCliente  diasOcupada  ocupantes
		System.out.println("id\t\tPrecio\t\tPrecio final\t\tNombre cliente\t\tDías\t\tOcupantes");
		for (int i = 0; i < habitaciones.length; i++) {
			System.out.println(habitaciones[i].getId()+"\t\t"+habitaciones[i].getPrecioBase()+"\t\t"+calcularPrecioFinal(h, descuento)+"\t\t\t"+
		habitaciones[i].getNombreCliente()+"\t\t\t"+habitaciones[i].getDiasOcupada()+"\t\t"+habitaciones[i].getOcupantes());
		}
	}
	
	public void verLista() {
		System.out.println("id\t\tPrecio\t\tNombre cliente\t\tDías\t\tOcupantes");
		for (int i = 0; i < habitaciones.length; i++) {
			System.out.println(habitaciones[i].getId()+"\t\t"+habitaciones[i].getPrecioBase()+"\t\t"+habitaciones[i].getNombreCliente()+"\t\t\t"+habitaciones[i].getDiasOcupada()+"\t\t"+habitaciones[i].getOcupantes());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		public Habitacion buscarPorId(int tam, int id) {
			boolean encontrado = false;
			int i=0;
			while(i<tam&&!encontrado) {
				if(habitaciones[i].getId()==id) {
					encontrado = true;
				}else {
					i++;
				}
			}
			if(encontrado) {
				return habitaciones[i];
			}else {
				return null;
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
