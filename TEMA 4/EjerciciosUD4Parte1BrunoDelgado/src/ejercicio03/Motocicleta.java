package ejercicio03;

public class Motocicleta extends VehiculosAMotor {

	public Motocicleta(double cilindrada, double caballos, int categoriaECO) {
		super(cilindrada, caballos, categoriaECO);
	}

	@Override
	public double calcularImpuesto(double fijo,double porcentajeMoto, double porcentajeCoche) {
		double cien=100;
		return super.calcularImpuesto(fijo, porcentajeMoto, porcentajeCoche)+cilindrada*porcentajeMoto/cien;
	}

}
