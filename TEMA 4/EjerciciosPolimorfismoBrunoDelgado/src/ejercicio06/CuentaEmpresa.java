package ejercicio06;

public class CuentaEmpresa extends Cuenta {

	public CuentaEmpresa(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ingresar(double ingreso) {
		// TODO Auto-generated method stub
		super.setSaldo(super.getSaldo()+ingreso);
	}

	@Override
	public void retirar(double retiro) {
		// TODO Auto-generated method stub
		int uno = 1;
		super.setSaldo(super.getSaldo()-retiro-uno);
	}

	
	
}
