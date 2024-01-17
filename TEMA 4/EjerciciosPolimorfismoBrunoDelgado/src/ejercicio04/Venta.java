package ejercicio04;

import java.util.Arrays;

public class Venta {
	
	private LineaDeVenta[] listado;

	public Venta(LineaDeVenta[] listado) {
		this.listado = listado;
	}
	
	//calculo el total de todo el ticket
	public double calcularTotal() {
		double resultado = 0;
		for (int i = 0; i < listado.length; i++) {
			resultado = resultado + listado[i].calcularPrecio();
		}
		return resultado;
	}
	
	public void imprimirCabecera() {
		System.out.println("Producto\tCantidad\tPrecio Unitario\t\tPrecio Final");
	}
	
	public void imprimirFinal() {
		System.out.println("Total: "+calcularTotal());
	}
	
	public void imprimir () {
		for (int i = 0; i < listado.length; i++) {
			listado[i].imprimirLineaDeVenta();
			System.out.println("\n");
		}
	}
	
	public void imprimirListado() {
		for (int i = 0; i < listado.length; i++) {
			listado[i].imprimirProductos();
			System.out.println("\n");
		}
	}

	@Override
	public String toString() {
		return "Venta [listado=" + Arrays.toString(listado) + "]";
	}
	
	

}
