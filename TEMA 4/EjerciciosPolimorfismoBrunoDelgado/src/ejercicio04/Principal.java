package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto pan = new Alimentacion (1.10, "Pan", 1, 2, 20);
		
		Producto lechuga = new Alimentacion (1.30, "Lechuga", 3, 678, 20);
		
		Producto movil = new Electronica (300, "Móvil", 2, 15);
		
		LineaDeVenta ldv1 = new LineaDeVenta (pan, 2);
		
		LineaDeVenta ldv2 = new LineaDeVenta (movil, 1);
		
		LineaDeVenta ldv3 = new LineaDeVenta (lechuga, 4);
		
		int tam=3;
		
		int eleccion;
		
		LineaDeVenta[] listado = new LineaDeVenta[tam];
		
		listado[0] = ldv1;
		
		listado[1] = ldv2;
		
		listado[2] = ldv3;
		
		Venta v = new Venta(listado);
		

		
		do {
			System.out.println("""
					\n
					1. Para imprimir el ticket
					2. para ver todos los productos
					""");
			eleccion=Leer.datoInt();
			switch(eleccion) {
			case 1:
				v.imprimirCabecera();
				v.imprimir();
				v.imprimirFinal();
				break;
			case 2:
				v.imprimirListado();
				break;
				default:
					System.out.println("Elige otro número");
				
			}
		}while(eleccion!=0);
		
		
	}

}
