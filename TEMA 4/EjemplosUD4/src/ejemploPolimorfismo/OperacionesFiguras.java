package ejemploPolimorfismo;

public class OperacionesFiguras {

	
	public double calcularAreaUnaFigura (Figura f) {
		return f.calcularArea();
	}
	
	
	//calcular la suma de las áreas de una lista de figuras 
	public double calcularSumaAreas(Figura[]f) {
		double resultado = 0;
		for (int i = 0; i < f.length; i++) {
			resultado = resultado + calcularAreaUnaFigura(f[i]);
			//o
			//resultado = resultado + f[i].calcularArea(); pero mejor la otra
		}
		return resultado;
	}
	
	public double sumarConAviso (Figura[]f) {
		double resultado = 0;
		for (int i = 0; i < f.length; i++) {
			resultado = resultado + calcularAreaUnaFigura(f[i]);
			if(f[i] instanceof Circulo) {
				((Circulo)f[i]).mostrarRadianes();
			}
		}
		return resultado;
	}
}
