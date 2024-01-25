package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam = 4;
		int id;
		double entregado;
		double descuento = 15,
				fijoDoble = 120;

		Producto m = new Movil(1, 1000, 1, "iPhone 15", "Apple", false);
		
		Producto m2 = new Movil(2, 1400, 5, "Samsung S24", "Samsung", true);
		
		Producto e1 = new EspadaLaser (3, 2200, 2, "Espada Jedi", false, "Individual", fijoDoble);
		
		Producto e2 = new EspadaLaser (4, 2300, 4, "Espada Sith", false, "Doble", fijoDoble);
		

		
		Producto[]listado=new Producto[tam];
		
		listado[0]=m;
		listado[1]=m2;
		listado[2]=e1;
		listado[3]=e2;
		
		
		Ventas v = new Ventas(listado);
		
		
		System.out.println("Hay "+v.calcularSinVender(tam)+" productos sin vender.");
		
		System.out.println();
		
		System.out.println("El total recaudado por ventas es de: "+v.calcularTotalVentas(descuento, fijoDoble)+" euros");
		
		System.out.println();
		
		System.out.println("Esta es la lista de productos:");
		
		v.verLista();
		
		System.out.println("Diga id para comprar");
		
		id=Leer.datoInt();
		
		System.out.println("El precio es: "+v.calcularPVPProducto(tam, fijoDoble, tam, id)+" euros");
		
		System.out.println("¿Con cuánto vas a pagar?");
		entregado=Leer.datoDouble();
		
		System.out.println("Genial, se te devuelve un cambio de "+v.devolverCambio(entregado, tam, fijoDoble, tam, id)+" euros");
		
		System.out.println();
		
		System.out.println("Veamos la lista de nuevo");
		
		v.verListaConAviso();
		
		
		
		
		
		
	}

}
