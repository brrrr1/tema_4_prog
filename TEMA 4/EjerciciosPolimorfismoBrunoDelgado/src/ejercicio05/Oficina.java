package ejercicio05;

import java.util.Iterator;


public class Oficina {
	
	private Empleado [] listado;

	public Oficina(Empleado[] listado) {
		this.listado = listado;
	}

	public double calcularSalario(Empleado p) {
			return p.calcularSueldo();	
	}
	

	
	public void felicitacion(int objetivoVentas) {
		for (int i = 0; i < listado.length; i++) {
			if(listado[i] instanceof Vendedor) {
				((Vendedor)listado[i]).felicitacion(objetivoVentas);;
			}
		}
	}
	
	
	
	public double calcularTotalPagado() {
		double resultado = 0;
		for (int i = 0; i < listado.length; i++) {
			resultado = resultado + listado[i].calcularSueldo();
		}
		return resultado;
	}
	
}
