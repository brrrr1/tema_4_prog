package ejercicio06;

public class Oficina {
	
	private Cuenta [] listado;
	
	public Oficina(Cuenta[] listado) {
		this.listado = listado;
	}

	public Cuenta[] getListadoCuentas() {
		return listado;
	}

	public void setListadoCuentas(Cuenta[] listadoCuentas) {
		this.listado = listado;
	}

	
	public void ingresar(Cliente c, double ingreso) {
		c.ingresar(ingreso);
		}
	
	public void retirar(Cliente c, double retiro) {
		c.ingresar(retiro);
	}
	
	public double calcularTotalCuentas() {
		double resultado = 0;
		for (int i = 0; i < listado.length; i++) {
			resultado = resultado + listado[i].getSaldo();
		}
		return resultado;
	}
	
	public void verSaldo(Cliente c) {
		c.verSaldo();
	}
	
	public Cliente buscarById (int id, int tam, Cliente [] listaClientes) {
		boolean encontrado=false;
		int i=0;
		
		while (i<tam && !encontrado) {
			if(listaClientes[i].getId() == id) {
				encontrado = true;
			} else {
				i++;
			}
		}
		
		if(encontrado) {
			return listaClientes[i];
		}else {
			return null;
		}
	}

	public void verSaldo (int id, int tam, Cliente [] listaClientes) {
		int uno = 1;
		for (int i = 0; i < uno; i++) {
			listaClientes[i]=buscarById(id, tam, listaClientes);
			listaClientes[i].verSaldo();
		}
	}
	
	public void sacarDinero (int id, int tam, Cliente [] listaClientes, double retiro) {
		int uno = 1;
		for (int i = 0; i < uno; i++) {
			listaClientes[i]=buscarById(id, tam, listaClientes);
			listaClientes[i].retirar(retiro);;
		}
	}
	
	public void ingresarDinero (int id, int tam, Cliente [] listaClientes, double ingreso) {
		int uno = 1;
		for (int i = 0; i < uno; i++) {
			listaClientes[i]=buscarById(id, tam, listaClientes);
			listaClientes[i].retirar(ingreso);;
		}
	}
	
	public double calcularSaldoTotal(Cuenta c, double ingreso, double retirada) {
		return c.calcularSaldoTotal(ingreso, retirada);
	}
	
	public double calcularDineroTotal(double ingreso, double retirada) {
		double resultado = 0;
		for (int i = 0; i < listado.length; i++) {
			if(listado != null) {
				resultado = resultado + calcularSaldoTotal(listado[i], ingreso, retirada);
			}
		}
		return resultado;
	}
	
	public double calcularRegaloJovenes() {
		double resultado=0;
		for (int i = 0; i < listado.length; i++) {
			if(listado[i] != null && listado[i] instanceof CuentaJoven) {
				resultado = resultado +((CuentaJoven) listado[i]).getRegalo();
			}
		}
		return resultado;
	}

	public double calcularCobroEmpresas() {
		double resultado=0;
		for (int i = 0; i < listado.length; i++) {
			if(listado[i] != null && listado[i] instanceof CuentaEmpresa) {
				resultado = resultado + ((CuentaEmpresa) listado[i]).getCobro();
			}
		}
		return resultado;
	}
	

	

	
}
