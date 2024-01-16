package ejemploFigura;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Figura f = new Figura (2, 6);
		//no se puede instanciar un objeto figura porque es abstracta
		
		//esto si se puede
		//Cuadrado c = new Cuadrado(2,2,2);
		//Rectangulo r = new Rectangulo (2, 2, 2, 4);
		
		
		//el tipo es de lo que ponga en la izquierda del igual		
		Figura cu = new Cuadrado (2,2,2);
		
		Figura ci = new Circulo (2,2,2);
		
		Figura re = new Rectangulo (2, 2, 2, 4);
		
		//System.out.println(c.calcularArea());
		
		System.out.println(cu.calcularArea());
		
		System.out.println(ci.calcularArea());
		
		System.out.println(re.calcularArea());
		
	}

}
