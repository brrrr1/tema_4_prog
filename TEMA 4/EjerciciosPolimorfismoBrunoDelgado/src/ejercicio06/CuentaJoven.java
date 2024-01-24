package ejercicio06;

public class CuentaJoven extends Cuenta{

	public CuentaJoven(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
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
