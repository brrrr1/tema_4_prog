package ejercicio03;

public class Coche extends VehiculosAMotor{

	public Coche(double cilindrada, double caballos, int categoriaECO) {
		super(cilindrada, caballos, categoriaECO);
		// TODO Auto-generated constructor stub
	}

	public double calcularImpuesto(double fijo) {
		double veinticinco=25;
		double cien=100;
		return super.calcularImpuesto(fijo)+caballos*veinticinco/cien;
	}
}
