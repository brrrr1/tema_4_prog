package ejercicio06;

public abstract class Cuenta {

	private double saldo;

	public Cuenta(double saldo) {
		this.saldo = saldo;
	}

	public abstract double ingresar(double ingreso);
	
	public abstract double retirar(double retiro);

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
