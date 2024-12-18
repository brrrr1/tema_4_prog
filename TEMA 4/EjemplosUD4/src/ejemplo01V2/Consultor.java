package ejemplo01V2;

public class Consultor extends Trabajador {

	private int horas;
	private double tarifas;
	
	
	public Consultor(String nombre, String puesto, String dni, int horas, double tarifas) {
		super(nombre, puesto, dni);
		this.horas = horas;
		this.tarifas = tarifas;
	}


	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}


	public double getTarifas() {
		return tarifas;
	}


	public void setTarifas(double tarifas) {
		this.tarifas = tarifas;
	}


	@Override
	public String toString() {
		return super.toString() + "Consultor [horas=" + horas + ", tarifas=" + tarifas + "]";
	}
	
	public double calcularPaga () {
		return super.calcularPaga()+horas*tarifas;
	}
	
	public void avisarExtras () {
		if(horas>40) {
			System.out.println("Ha trabajado tela");
		}
	}
	
	
	
}
