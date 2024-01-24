package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto p = new Producto();
		Trabajador t = new Trabajador();
		
		System.out.println(p.calculoIva(10, 12));
		
		System.out.println(t.calculoIrpf(1000));
		
		
		
	}

}
