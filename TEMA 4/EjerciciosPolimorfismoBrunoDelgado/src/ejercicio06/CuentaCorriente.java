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
	public void ingresar(double ingreso) {
		// TODO Auto-generated method stub
		puntos++;
		super.setSaldo(super.getSaldo()+ingreso-mantenimiento);
	}

	@Override
	public void retirar(double retiro) {
		// TODO Auto-generated method stub
		puntos++;
		super.setSaldo(super.getSaldo()-retiro-mantenimiento);
	}
	
	public double calcularTotal() {
		return super.getSaldo();
	}

}
