package ejercicio03;

public class Motocicleta extends VehiculosAMotor {

	public Motocicleta(double cilindrada, double caballos, int categoriaECO) {
		super(cilindrada, caballos, categoriaECO);
	}

	@Override
	public double calcularImpuesto(double fijo) {
		double sesenta=60;
		double cien=100;
		return super.calcularImpuesto(fijo)+cilindrada*sesenta/cien;
	}

	
}
