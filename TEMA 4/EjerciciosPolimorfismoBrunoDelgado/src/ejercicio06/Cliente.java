package ejercicio06;

public class Cliente {
	
	private double saldo;
	private Cuenta c;
	private int id;
	public Cliente(double saldo, Cuenta c, int id) {
		this.saldo = saldo;
		this.c = c;
		this.id = id;
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



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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
