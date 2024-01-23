package ejercicio05;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado e1 = new Empleado("Pepito", "Grillo", 1000, 30);

		Empleado v1 = new Vendedor("Luis", "Rubiales", 1000, 1, 30, 25);
		
		Empleado g1 = new Gerente ("Cristiano", "Ronaldo", 1000, 2, 15);
		
		int tam = 3;
		
		int objetivoVentas = 3;
		
		Empleado listado[] = new Empleado[tam];
		
		listado[0] = v1;
		
		listado [1] = g1;
		
		listado[2] = e1;
		
		Oficina o = new Oficina (listado);
		
		
		System.out.println("Sueldo Cristiano:");
		System.out.println(o.calcularSalario(g1));
		
		System.out.println();
		
		System.out.println("Sueldo Rubiales:");
		System.out.println(o.calcularSalario(v1));
		o.felicitacion(objetivoVentas);
		
		
		System.out.println();
		
		System.out.println("Sueldo Pepito:");
		System.out.println(o.calcularSalario(e1));
		
		System.out.println();
		
		System.out.println("Total gastado por la empresa:");
		
		System.out.println(o.calcularTotalPagado());
		
		
		
		
		
		
		
		
		
	}

}
