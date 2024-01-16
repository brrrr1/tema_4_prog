package ejercicio03;

public class Furgoneta extends VehiculosAMotor{

	private double fijoTransporte;

	public Furgoneta(double cilindrada, double caballos, int categoriaECO, double fijoTransporte) {
		super(cilindrada, caballos, categoriaECO);
		this.fijoTransporte = fijoTransporte;
	}
	
	public double calcularImpuesto(double fijo,double porcentajeMoto, double porcentajeCoche) {
		return super.calcularImpuesto(fijo,porcentajeMoto,porcentajeCoche)+fijoTransporte;
	}
}
