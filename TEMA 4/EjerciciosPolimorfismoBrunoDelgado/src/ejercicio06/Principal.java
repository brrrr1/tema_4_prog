package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ingreso;
		double retiro;

		Cuenta cc = new CuentaCorriente(1000, 50, 10);
		
		Cuenta cj = new CuentaJoven (1000, 1);
		
		Cuenta ce = new CuentaEmpresa (1000, 1);
		
		
		Cliente c1 = new Cliente(3000, cc, 1);
		
		Cliente c2 = new Cliente(3000, cj, 2);
		
		Cliente c3 = new Cliente(3000, ce, 3);
		
	
		int tam = 3;
		int id;
		int eleccion;
		Cuenta listado [] = new Cuenta [tam];
		
		listado[0] = cc;
		
		listado[1] = cj;
		
		listado[2] = ce;
		
		Cliente [] listaClientes = new Cliente [tam];
		
		listaClientes[0] = c1;
		listaClientes[1] = c2;
		listaClientes[2] = c3;



		
		Oficina o = new Oficina (listado);
		
		System.out.println("Diga id:");
		id=Leer.datoInt();
		
		
		do {
			imprimirMenu();
			eleccion = Leer.datoInt();
			
			switch (eleccion) {
				case 1:
					System.out.println("Diga cuanto dinero quiere retirar");
					retiro = Leer.datoDouble();
					
					o.sacarDinero(id, tam, listaClientes, retiro);
				break;
				
				case 2:
					System.out.println("Diga cuanto dinero quiere ingresar");
					ingreso = Leer.datoDouble();
					o.ingresarDinero(id, tam, listaClientes, ingreso);
				break;
				
				case 3:					
					o.verSaldo(id, tam, listaClientes);
				break;
				
				case 4:
					ingreso = 0;
					retiro = 0;
					o.calcularDineroTotal(ingreso, retiro);
				break;
				
				case 5:
					o.calcularCobroEmpresas();
				break;
				
				case 6:
					o.calcularRegaloJovenes();
				break;
				
				case 0:
					System.out.println("Gracias por confiar en nosotros!!");
				break;
				
				default:
					System.out.println("Número NO comentado anteriormente");
				break;
			}
			
		}while(eleccion!=0);
		
	}

	
	public static void imprimirMenu() {
		System.out.println("(1) Retirar dinero");
		System.out.println("(2) Ingresar dinero");
		System.out.println("(3) Ver su saldo");
		System.out.println("(4) Ver total ganado entre todas las cuetas (Oficina)");
		System.out.println("(5) Ver total ganado por el robo a las empresas (Oficina)");
		System.out.println("(6) Ver total perdido por el regalo a los jovenes (Oficina)");
		System.out.println("(0) Salir del banco");
	}


		
		
		
	

}
