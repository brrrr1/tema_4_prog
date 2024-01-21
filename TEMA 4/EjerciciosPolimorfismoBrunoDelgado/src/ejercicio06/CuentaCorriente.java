package ejercicio06;

public class CuentaCorriente extends Cuenta {
	
	private double mantenimiento;
	private int puntos;
	
	

	public CuentaCorriente(double saldo, double mantenimiento, int puntos) {
		super(saldo);
		this.mantenimiento = mantenimiento;
		this.puntos = puntos;
	}

	@Override
	public double ingresar(double ingreso) {
		// TODO Auto-generated method stub
		puntos++;
		return super.getSaldo()+ingreso-mantenimiento;
	}

	@Override
	public double retirar(double retiro) {
		// TODO Auto-generated method stub
		puntos++;
		return super.getSaldo()-retiro-mantenimiento;
	}

}
