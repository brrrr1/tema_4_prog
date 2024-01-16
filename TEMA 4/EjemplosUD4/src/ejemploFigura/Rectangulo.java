package ejemploFigura;

public class Rectangulo extends Figura {

	private double lado;
	private double altura;
	
	

	public Rectangulo(double x, double y, double lado, double altura) {
		super(x, y);
		this.lado = lado;
		this.altura = altura;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Rectangulo [lado=" + lado + ", altura=" + altura + "]";
	}
	
	public double calcularArea() {
		return lado*altura;
	}
	
	
}
