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
	
	

	
}
