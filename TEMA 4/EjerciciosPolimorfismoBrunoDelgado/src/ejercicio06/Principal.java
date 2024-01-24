package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ingreso;
		double retiro;

		Cuenta cc = new CuentaCorriente(1000, 50, 10);
		
		Cuenta cj = new CuentaJoven (1000);
		
		Cuenta ce = new CuentaEmpresa (1000);
		
		
		Cliente c1 = new Cliente(3000, cc);
		
		Cliente c2 = new Cliente(3000, cj);
		
		Cliente c3 = new Cliente(3000, ce);
		
	
		int tam = 3;
		
		Cuenta listado [] = new Cuenta [tam];
		
		listado[0] = cc;
		
		listado[1] = cj;
		
		listado[2] = ce;
		
		Oficina o = new Oficina (listado);
		
		System.out.println("CLIENTE 1");
		
		System.out.println("Ingresar");
		
		ingreso=Leer.datoDouble();
		
		o.ingresar(c1, ingreso);

		o.verSaldo(c1);
		
		System.out.println("Retirar");
		
		retiro=Leer.datoDouble();
		
		o.retirar(c1, retiro);

		o.verSaldo(c1);
		
		System.out.println("CLIENTE 2");
		
		System.out.println("Ingresar");
		
		ingreso=Leer.datoDouble();
		
		o.ingresar(c2, ingreso);

		o.verSaldo(c2);
		
		System.out.println("Retirar");
		
		retiro=Leer.datoDouble();
		
		o.retirar(c2, retiro);

		o.verSaldo(c2);
		
		System.out.println("CLIENTE 3");
		
		System.out.println("Ingresar");
		
		ingreso=Leer.datoDouble();
		
		o.ingresar(c3, ingreso);

		o.verSaldo(c3);
		
		System.out.println("Retirar");
		
		retiro=Leer.datoDouble();
		
		o.retirar(c3, retiro);

		o.verSaldo(c3);
		
		System.out.println("TOTAL");
		
		System.out.println(o.calcularTotalCuentas());
		
		
		
	}

}
