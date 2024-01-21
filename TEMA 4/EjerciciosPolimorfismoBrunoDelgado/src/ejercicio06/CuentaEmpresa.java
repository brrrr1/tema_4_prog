package ejercicio06;

public class CuentaEmpresa extends Cuenta {

	public CuentaEmpresa(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double ingresar(double ingreso) {
		// TODO Auto-generated method stub
		return super.getSaldo()+ingreso;
	}

	@Override
	public double retirar(double retiro) {
		// TODO Auto-generated method stub
		int uno = 1;
		return super.getSaldo()-retiro-uno;
	}

	
	
}
