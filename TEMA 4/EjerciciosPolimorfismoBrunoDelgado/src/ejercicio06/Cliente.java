package ejercicio06;

public class Cliente {
	
	private double saldo;
	private Cuenta c;
	public Cliente(double saldo, Cuenta c) {
		this.saldo = saldo;
		this.c = c;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cuenta getC() {
		return c;
	}
	public void setC(Cuenta c) {
		this.c = c;
	}
	
	public void ingresar(double ingreso) {
		c.ingresar(ingreso);
	}
	
	public void retirar(double retiro) {
		c.ingresar(retiro);
	}
	
	public void verSaldo() {
		c.verSaldo();
	}
	

}
