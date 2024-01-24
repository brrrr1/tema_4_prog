package ejercicio06;

public class CuentaEmpresa extends Cuenta {

	private int cobro;
	
	

	public CuentaEmpresa(double saldo, int cobro) {
		super(saldo);
		this.cobro = cobro;
	}
	
	

	public int getCobro() {
		return cobro;
	}



	public void setCobro(int cobro) {
		this.cobro = cobro;
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
