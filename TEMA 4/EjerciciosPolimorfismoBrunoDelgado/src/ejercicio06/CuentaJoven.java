package ejercicio06;

public class CuentaJoven extends Cuenta{

	public CuentaJoven(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double ingresar(double ingreso) {
		// TODO Auto-generated method stub
		int uno = 1;
		return super.getSaldo()+ingreso+uno;
	}

	@Override
	public double retirar(double retiro) {
		// TODO Auto-generated method stub
		return super.getSaldo()-retiro;
	}
	
	

	
}
