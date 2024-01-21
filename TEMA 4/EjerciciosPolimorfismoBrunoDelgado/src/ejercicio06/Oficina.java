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

	
	public double ingresar(Cliente c, double ingreso) {
			return c.ingresar(ingreso);
		}
	
	public double retirar(Cliente c, double retiro) {
		return c.ingresar(retiro);
	}
	
	public double calcularTotalCuentas() {
		double resultado = 0;
		for (int i = 0; i < listado.length; i++) {
			resultado = resultado + listado[i].getSaldo();
		}
		return resultado;
	}
	
	public void verSaldo() {
		for (int i = 0; i < listado.length; i++) {
			System.out.println(listado[i].getSaldo());
		}
	}
	
	

	
}
