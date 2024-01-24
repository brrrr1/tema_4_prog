package ejercicio01;

public class Revista extends Publicaciones {

	public Revista(boolean prestado, String nombre, String autor, int anioPublicacion) {
		super(prestado, nombre, autor, anioPublicacion);
		// TODO Auto-generated constructor stub
	}


	public void felicitarEdiciones(int objetivoFelicitaciones) {
		int ediciones = objetivoFelicitaciones; // ediciones tendría que ser un atributo pero lo pongo así porque no lo he hecho
		if(ediciones == objetivoFelicitaciones) {
			System.out.println("¡¡Enhorabuena!!");
		}
	}

}
