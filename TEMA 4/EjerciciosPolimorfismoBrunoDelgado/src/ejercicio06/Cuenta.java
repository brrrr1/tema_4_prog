package ejercicio06;

public abstract class Cuenta {

	private double saldo;

	public Cuenta(double saldo) {
		this.saldo = saldo;
	}

	public abstract void ingresar(double ingreso);
	
	public abstract void retirar(double retiro);

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void verSaldo() {
		System.out.println(saldo);
	}
	
	
	
}
