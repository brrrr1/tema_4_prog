package ejercicio03;

public class VehiculosAMotor {

	protected double cilindrada;
	protected double caballos;
	private int categoriaECO;
	
	public VehiculosAMotor(double cilindrada, double caballos, int categoriaECO) {
		this.cilindrada = cilindrada;
		this.caballos = caballos;
		this.categoriaECO = categoriaECO;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public double getCaballos() {
		return caballos;
	}

	public void setCaballos(double caballos) {
		this.caballos = caballos;
	}

	public int getCategoriaECO() {
		return categoriaECO;
	}

	public void setCategoriaECO(int categoriaECO) {
		this.categoriaECO = categoriaECO;
	}

	@Override
	public String toString() {
		return "VehiculosAMotor [cilindrada=" + cilindrada + ", caballos=" + caballos + ", categoriaECO=" + categoriaECO
				+ "]";
	}
	
	public double calcularImpuesto(double fijo) {
		return fijo;
	}
	
	
	
	
}