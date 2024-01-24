package ejercicio06;

public class CuentaJoven extends Cuenta{
	
	private int regalo;



	public CuentaJoven(double saldo, int regalo) {
		super(saldo);
		this.regalo = regalo;
	}

	
	
	public int getRegalo() {
		return regalo;
	}



	public void setRegalo(int regalo) {
		this.regalo = regalo;
	}



	@Override
	public void ingresar(double ingreso) {
		// TODO Auto-generated method stub
		int uno = 1;
		super.setSaldo(super.getSaldo()+ingreso+uno);
	}

	@Override
	public void retirar(double retiro) {
		// TODO Auto-generated method stub
		super.setSaldo(super.getSaldo()-retiro);
	}
	
	

	
}
