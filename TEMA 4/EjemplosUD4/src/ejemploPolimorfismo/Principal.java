package ejemploPolimorfismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OperacionesFiguras op = new OperacionesFiguras();
		Cuadrado c = new Cuadrado("Cuadrado 1", "Negro", 2);
		Figura f1 = new Cuadrado("Figura como cuadrado", "Rojo", 4);
		Figura f2 = new Circulo("Figura como círculo", "Blanco", 3);
		Circulo ci = new Circulo("Círculo 1","Azul", 6);
		
		
		int tam = 4;
		//Listado		
		Figura [] lista = new Figura [tam];
		//para el ejemplo
		lista[0]=c;
		lista[1]=ci;
		lista[2]=f1;
		lista[3]=f2;
		
		
		System.out.printf("El área es %.2f",op.calcularAreaUnaFigura(c));
		System.out.println();
		System.out.printf("El área es %.2f",op.calcularAreaUnaFigura(f1));
		System.out.println();
		System.out.printf("El área es %.2f",op.calcularAreaUnaFigura(f2));
		System.out.println();
		System.out.printf("El área es %.2f",op.calcularAreaUnaFigura(ci));
		System.out.println();
		
		//Métodos no reescritos
		c.soloFigura();
		ci.soloFigura();
		
		c.mostrarCuadrado();
		ci.mostrarRadianes();
		
		System.out.println();
		
		System.out.println("*********************************");
		
		System.out.println(op.calcularSumaAreas(lista));
		
		
		
		
		
	}

}
