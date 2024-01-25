package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Habitacion h = new Habitacion(1, 200, false, "Luismi", 3, 2);
		Habitacion s = new Suite (2, 450, false, "Miguel", 7, 8, 140, 300);
		Habitacion a = new Apartamento (3,250, true, "Fanegas", 2, 3, true, 40);
		
		double descuento=15;
		int tam = 3;
		int id, eleccion;
		
		Habitacion [] habitaciones = new Habitacion [tam];
		
		habitaciones[0] = h;
		habitaciones[1] = s;
		habitaciones[2] = a;
		
		GestionHabitaciones gh = new GestionHabitaciones(habitaciones);
		
		/*gh.verLista();
		
		System.out.println();
		System.out.println();
		
		gh.mostrarNoOcupadas();*/
		
		//gh.imprimirFactura(h, descuento);
		
		System.out.println("Estas son todas las habitaciones:");
		gh.verLista();
		
		System.out.println("Diga el id con el que quiere trabajar:");
		
		id=Leer.datoInt();
		
		
		System.out.println("""
				1)Calcular el precio para esa habitación
				2)Calcular lo recaudado entre todas las habitaciones
				3)Mostrar la factura
				4)Mostrar lista de habitaciones sin ocupar
				""");
		do {
			eleccion=Leer.datoInt();
			switch(eleccion) {
			case 1:
				System.out.println("El precio final es de "+gh.calcularPrecioFinal(h, descuento)+" euros");
				break;
			case 2:
				System.out.println("El total recaudado por el hotel es de "+gh.calcularTotalRecaudado(descuento)+" euros");
				break;
			case 3:
				gh.imprimirFactura(h, descuento);
				break;
			case 4:
				gh.mostrarNoOcupadas();
			}
			
			
		}while(eleccion!=0);
		
}
	
}
