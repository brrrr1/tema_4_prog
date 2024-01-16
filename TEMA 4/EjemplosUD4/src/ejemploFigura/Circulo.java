package ejemploFigura;

public class Circulo extends Figura{

	private double radio;

	public Circulo(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
	public double calcularArea() {
		double dos = 2;
		return radio*Math.pow(Math.PI, dos);
	}
	
}
