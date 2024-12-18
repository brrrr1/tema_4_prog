package ejercicio03;

public class VehiculosAMotor {

	protected double cilindrada;
	protected double caballos;
	protected int categoriaECO;
	
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
	
	public double calcularImpuesto(double fijo,double porcentajeMoto, double porcentajeCoche) {
		switch(categoriaECO) {
		case 1:
			fijo=0;
			break;
		case 2:
			fijo=fijo+40;
			break;
		case 3:
			fijo=fijo+250;
			break;
		case 4:
			fijo=fijo+500;
			break;
			default:
				System.out.println("brrrr");
		}
		return fijo;
	}
	
	
	
	
}
