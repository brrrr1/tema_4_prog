package ejemplooo;

public class Animal implements IDepredador, IPresa {

	private String nombre;
	private int patas;
	
	public Animal(String nombre, int patas) {
		this.nombre = nombre;
		this.patas = patas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", patas=" + patas + "]";
	}

	@Override
	public void localizar(Animal presa) {
		// TODO Auto-generated method stub
		System.out.println("Ando buscando a Vector");
		
	}

	@Override
	public void cazar(Animal presa) {
		// TODO Auto-generated method stub
		System.out.println("Brrrrrrrr");
		
	}

	@Override
	public void huir() {
		// TODO Auto-generated method stub
		System.out.println("adios");
	}
	
	
	
	
	
	
	
}
