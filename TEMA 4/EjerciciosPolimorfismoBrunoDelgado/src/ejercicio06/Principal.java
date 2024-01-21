package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ingreso;
		double retiro;

		Cuenta cc = new CuentaCorriente(3000, 50, 10);
		
		Cuenta cj = new CuentaJoven (3000);
		
		Cuenta ce = new CuentaEmpresa (3000);
		
		
		Cliente c1 = new Cliente(3000, cc);
		
		Cliente c2 = new Cliente(3000, cj);
		
		Cliente c3 = new Cliente(3000, ce);
		
	
		int tam = 3;
		
		Cuenta listado [] = new Cuenta [tam];
		
		listado[0] = cc;
		
		listado[1] = cj;
		
		listado[2] = ce;
		
		Oficina o = new Oficina (listado);
		
		ingreso=Leer.datoDouble();
		
		o.ingresar(c1, ingreso);

		o.verSaldo();
		
		retiro=Leer.datoDouble();
		
		o.retirar(c1, retiro);

		o.verSaldo();
		
		
		
	}

}
